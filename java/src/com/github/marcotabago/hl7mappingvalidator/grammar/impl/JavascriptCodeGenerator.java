package com.github.marcotabago.hl7mappingvalidator.grammar.impl;

import java.util.List;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorBaseListener;
import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorParser;
import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorParser.AssertConditionalStatementContext;
import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorParser.AssertTrueStatementContext;
import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorParser.AssertionOperatorContext;
import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorParser.AssertionStatementContext;
import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorParser.ProgramContext;
import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorParser.SingleExpressionContext;
import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorParser.StatementListContext;

public class JavascriptCodeGenerator extends
		HL7MappingValidatorBaseListener {

	public enum AssertionStatementState {
		STARTED, PROCESSING, ENDED
	};

	private HL7MappingValidatorParser parser;

	private AssertionStatementState currentState;

	private String currentActualValuePath;

	private StringBuffer javascriptBuffer;

	public String getGeneratedJavascript() {
		return this.javascriptBuffer.toString();
	}

	public JavascriptCodeGenerator(HL7MappingValidatorParser parser) {
		super();
		this.parser = parser;
		this.javascriptBuffer = new StringBuffer();
	}

	private String getEquivalentOperator(String assertionOperator) {
		String operator = assertionOperator;
		return operator;
	}

	@Override
	public void enterProgram(ProgramContext ctx) {
		this.javascriptBuffer.append("function getAssertions() {\n");
		this.javascriptBuffer.append("\tvar $assertions = [];\n");
		super.enterProgram(ctx);
	}

	@Override
	public void exitProgram(ProgramContext ctx) {
		this.javascriptBuffer.append("\treturn $assertions;\n}\n\n ");
		// this.javascriptBuffer.append("getAssertions();");
		super.exitProgram(ctx);
	}

	@Override
	public void enterAssertionStatement(AssertionStatementContext ctx) {
		// System.out.println("assertionStatement rule found: " +
		// ctx.getText());
		super.enterAssertionStatement(ctx);
	}

	@Override
	public void exitAssertionStatement(AssertionStatementContext ctx) {
		this.currentState = AssertionStatementState.ENDED;
		this.currentActualValuePath = null;
		super.exitAssertionStatement(ctx);
	}

	@Override
	public void enterAssertTrueStatement(AssertTrueStatementContext ctx) {
		this.currentState = AssertionStatementState.STARTED;
		String assertionPushCall = translateToAssertionsPushCall(
				ctx.assertionStatementLeftHandSide, ctx.assertionOperator(),
				ctx.assertionStatementRightHandSide);
		this.javascriptBuffer.append(assertionPushCall);
		super.enterAssertTrueStatement(ctx);
	}

	@Override
	public void enterAssertConditionalStatement(
			AssertConditionalStatementContext ctx) {
		this.currentState = AssertionStatementState.STARTED;
		SingleExpressionContext assertionStatementLeftHandSide = ctx.assertionStatementLeftHandSide;
		StatementListContext statementList = ctx.assertConditionalRightHandSideExpression().statementList();
		String translatedRightHandSide = translateToAssertionsPushCalls(assertionStatementLeftHandSide, statementList);
		this.javascriptBuffer.append(translatedRightHandSide);
		super.enterAssertConditionalStatement(ctx);
	}

	private String translateToAssertionsPushCall(
			SingleExpressionContext assertionStatementLeftHandSide,
			AssertionOperatorContext operator,
			SingleExpressionContext assertionStatementRightHandSide) {
		StringBuffer pushFunctionCallBuffer = new StringBuffer();
		String actualValuePath = assertionStatementLeftHandSide.getText();
		pushFunctionCallBuffer.append("\t$assertions.push(\n\t\t{\n");
		pushFunctionCallBuffer.append("\t\t\t\"actualValuePath\" : \""
				+ actualValuePath + "\",\n");
		String translatedLeftHandSide = translateAssertionFunctionShortcuts(assertionStatementLeftHandSide, false);
		pushFunctionCallBuffer.append("\t\t\t\"actualValue\" : "
				+ translatedLeftHandSide + ",\n");
		String assertionOperator = "?=";
		String translatedRightHandSide = "null";
		if (operator != null) {
			assertionOperator = operator.getText();
			translatedRightHandSide = translateAssertionFunctionShortcuts(assertionStatementRightHandSide, false);
		} else {
			translatedRightHandSide = translateAssertionFunctionShortcuts(assertionStatementLeftHandSide, true);
		}
		pushFunctionCallBuffer.append("\t\t\t\"operator\" : \""
				+ getEquivalentOperator(assertionOperator) + "\",\n");
		pushFunctionCallBuffer.append("\t\t\t\"expectedValue\" : "
				+ translatedRightHandSide + "\n");
		pushFunctionCallBuffer.append("\t\t}\n\t);\n");
		return pushFunctionCallBuffer.toString();
	}

	private void detectAssertionShortcuts(RuleContext ctx) {
		String xpath = "//singleExpression";
		ParseTree parseTree = (ParseTree) ctx;
		ParseTreePattern p = this.parser.compileParseTreePattern(
				"@ <arguments>",
				HL7MappingValidatorParser.RULE_singleExpression);
		List<ParseTreeMatch> matches = p.findAll(parseTree, xpath);
		for (ParseTreeMatch match : matches) {
			System.out.println(match.getTree().getText());
		}

	}
	
	private String translateAssertionFunctionShortcuts(RuleContext ctx, boolean switchSourceAndDestination) {
		String translatedText = ctx.getText();
		String xpath = "//singleExpression";
		ParseTree parseTree = (ParseTree) ctx;
		
		// Translate @()
		ParseTreePattern destinationTerserCallPattern = this.parser.compileParseTreePattern(
				"@ <arguments>",
				HL7MappingValidatorParser.RULE_singleExpression);
		List<ParseTreeMatch> destinationTerserCallmatches = destinationTerserCallPattern.findAll(parseTree, xpath);
		for (ParseTreeMatch match : destinationTerserCallmatches) {
			String arguments = match.get("arguments").getText();
			String replacement = !switchSourceAndDestination ? "destinationTerser.get" : "sourceTerser.get";
			String translatedFunctionCall = replacement + arguments;
			String matchText = match.getTree().getText();
			translatedText = translatedText.replace(matchText, translatedFunctionCall);
		}
		
		// Translate $()
		ParseTreePattern sourceTerserCallPattern = this.parser.compileParseTreePattern(
				"$ <arguments>",
				HL7MappingValidatorParser.RULE_singleExpression);
		List<ParseTreeMatch> sourceTerserCallmatches = sourceTerserCallPattern.findAll(parseTree, xpath);
		for (ParseTreeMatch match : sourceTerserCallmatches) {
			String arguments = match.get("arguments").getText();
			String replacement = !switchSourceAndDestination ? "sourceTerser.get" : "destinationTerser.get";
			String translatedFunctionCall = replacement + arguments;
			String matchText = match.getTree().getText();
			translatedText = translatedText.replace(matchText, translatedFunctionCall);
		}
		
		return translatedText;
	}
	
	private String translateToAssertionsPushCalls(SingleExpressionContext assertionStatementLeftHandSide, RuleContext ctx) {
		String translatedText = ctx.getText();
		String xpath = "//singleExpression";
		ParseTree parseTree = (ParseTree) ctx;
		
		translatedText = translateAssertionFunctionShortcuts(ctx, false);
		
		ParseTreePattern assertionExpressionPattern = this.parser.compileParseTreePattern(
				"<assertionOperator> <singleExpression>",
				HL7MappingValidatorParser.RULE_singleExpression);
		List<ParseTreeMatch> assertionExpressionMatches = assertionExpressionPattern.findAll(parseTree, xpath);
		for (ParseTreeMatch match : assertionExpressionMatches) {
			AssertionOperatorContext operator = (AssertionOperatorContext) match.get("assertionOperator");
			SingleExpressionContext assertionStatementRightHandSide = (SingleExpressionContext) match.get("singleExpression");
			String translatedFunctionCall = translateToAssertionsPushCall(assertionStatementLeftHandSide, operator, assertionStatementRightHandSide);
			String matchTextTranslated = translateAssertionFunctionShortcuts((RuleContext) match.getTree(), false);
			translatedText = translatedText.replace(matchTextTranslated, translatedFunctionCall);
		}
		
		return translatedText;
	}

}
