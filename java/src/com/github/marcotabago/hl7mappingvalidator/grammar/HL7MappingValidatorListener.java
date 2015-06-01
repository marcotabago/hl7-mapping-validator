// Generated from HL7MappingValidator.g4 by ANTLR 4.4

    package com.github.marcotabago.hl7mappingvalidator.grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HL7MappingValidatorParser}.
 */
public interface HL7MappingValidatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(@NotNull HL7MappingValidatorParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(@NotNull HL7MappingValidatorParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(@NotNull HL7MappingValidatorParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(@NotNull HL7MappingValidatorParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(@NotNull HL7MappingValidatorParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(@NotNull HL7MappingValidatorParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull HL7MappingValidatorParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull HL7MappingValidatorParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpression(@NotNull HL7MappingValidatorParser.InstanceofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpression(@NotNull HL7MappingValidatorParser.InstanceofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(@NotNull HL7MappingValidatorParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(@NotNull HL7MappingValidatorParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull HL7MappingValidatorParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull HL7MappingValidatorParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(@NotNull HL7MappingValidatorParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(@NotNull HL7MappingValidatorParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(@NotNull HL7MappingValidatorParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(@NotNull HL7MappingValidatorParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(@NotNull HL7MappingValidatorParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(@NotNull HL7MappingValidatorParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull HL7MappingValidatorParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull HL7MappingValidatorParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(@NotNull HL7MappingValidatorParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(@NotNull HL7MappingValidatorParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(@NotNull HL7MappingValidatorParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(@NotNull HL7MappingValidatorParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(@NotNull HL7MappingValidatorParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(@NotNull HL7MappingValidatorParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#assertConditionalRightHandSideExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssertConditionalRightHandSideExpression(@NotNull HL7MappingValidatorParser.AssertConditionalRightHandSideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#assertConditionalRightHandSideExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssertConditionalRightHandSideExpression(@NotNull HL7MappingValidatorParser.AssertConditionalRightHandSideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(@NotNull HL7MappingValidatorParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(@NotNull HL7MappingValidatorParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link HL7MappingValidatorParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(@NotNull HL7MappingValidatorParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link HL7MappingValidatorParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(@NotNull HL7MappingValidatorParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(@NotNull HL7MappingValidatorParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(@NotNull HL7MappingValidatorParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(@NotNull HL7MappingValidatorParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(@NotNull HL7MappingValidatorParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForVarInStatement(@NotNull HL7MappingValidatorParser.ForVarInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForVarInStatement(@NotNull HL7MappingValidatorParser.ForVarInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(@NotNull HL7MappingValidatorParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(@NotNull HL7MappingValidatorParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#assertionStatements}.
	 * @param ctx the parse tree
	 */
	void enterAssertionStatements(@NotNull HL7MappingValidatorParser.AssertionStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#assertionStatements}.
	 * @param ctx the parse tree
	 */
	void exitAssertionStatements(@NotNull HL7MappingValidatorParser.AssertionStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(@NotNull HL7MappingValidatorParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(@NotNull HL7MappingValidatorParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull HL7MappingValidatorParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull HL7MappingValidatorParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull HL7MappingValidatorParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull HL7MappingValidatorParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull HL7MappingValidatorParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull HL7MappingValidatorParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull HL7MappingValidatorParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull HL7MappingValidatorParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(@NotNull HL7MappingValidatorParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(@NotNull HL7MappingValidatorParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(@NotNull HL7MappingValidatorParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(@NotNull HL7MappingValidatorParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(@NotNull HL7MappingValidatorParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(@NotNull HL7MappingValidatorParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull HL7MappingValidatorParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull HL7MappingValidatorParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(@NotNull HL7MappingValidatorParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(@NotNull HL7MappingValidatorParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyNameAndValueList(@NotNull HL7MappingValidatorParser.PropertyNameAndValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyNameAndValueList(@NotNull HL7MappingValidatorParser.PropertyNameAndValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull HL7MappingValidatorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull HL7MappingValidatorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull HL7MappingValidatorParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull HL7MappingValidatorParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#assertTrueStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertTrueStatement(@NotNull HL7MappingValidatorParser.AssertTrueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#assertTrueStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertTrueStatement(@NotNull HL7MappingValidatorParser.AssertTrueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(@NotNull HL7MappingValidatorParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(@NotNull HL7MappingValidatorParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(@NotNull HL7MappingValidatorParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(@NotNull HL7MappingValidatorParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(@NotNull HL7MappingValidatorParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(@NotNull HL7MappingValidatorParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull HL7MappingValidatorParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull HL7MappingValidatorParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterVoidExpression(@NotNull HL7MappingValidatorParser.VoidExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitVoidExpression(@NotNull HL7MappingValidatorParser.VoidExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull HL7MappingValidatorParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull HL7MappingValidatorParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitNotExpression(@NotNull HL7MappingValidatorParser.BitNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitNotExpression(@NotNull HL7MappingValidatorParser.BitNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(@NotNull HL7MappingValidatorParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(@NotNull HL7MappingValidatorParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorExpression(@NotNull HL7MappingValidatorParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorExpression(@NotNull HL7MappingValidatorParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull HL7MappingValidatorParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull HL7MappingValidatorParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull HL7MappingValidatorParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull HL7MappingValidatorParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(@NotNull HL7MappingValidatorParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(@NotNull HL7MappingValidatorParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull HL7MappingValidatorParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull HL7MappingValidatorParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitXOrExpression(@NotNull HL7MappingValidatorParser.BitXOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitXOrExpression(@NotNull HL7MappingValidatorParser.BitXOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(@NotNull HL7MappingValidatorParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(@NotNull HL7MappingValidatorParser.EofContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull HL7MappingValidatorParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull HL7MappingValidatorParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(@NotNull HL7MappingValidatorParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(@NotNull HL7MappingValidatorParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertionExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssertionExpression(@NotNull HL7MappingValidatorParser.AssertionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertionExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssertionExpression(@NotNull HL7MappingValidatorParser.AssertionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#assertConditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertConditionalStatement(@NotNull HL7MappingValidatorParser.AssertConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#assertConditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertConditionalStatement(@NotNull HL7MappingValidatorParser.AssertConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(@NotNull HL7MappingValidatorParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(@NotNull HL7MappingValidatorParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(@NotNull HL7MappingValidatorParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(@NotNull HL7MappingValidatorParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull HL7MappingValidatorParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull HL7MappingValidatorParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(@NotNull HL7MappingValidatorParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(@NotNull HL7MappingValidatorParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(@NotNull HL7MappingValidatorParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(@NotNull HL7MappingValidatorParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull HL7MappingValidatorParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull HL7MappingValidatorParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(@NotNull HL7MappingValidatorParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(@NotNull HL7MappingValidatorParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(@NotNull HL7MappingValidatorParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(@NotNull HL7MappingValidatorParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(@NotNull HL7MappingValidatorParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(@NotNull HL7MappingValidatorParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(@NotNull HL7MappingValidatorParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(@NotNull HL7MappingValidatorParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#assertionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertionStatement(@NotNull HL7MappingValidatorParser.AssertionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#assertionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertionStatement(@NotNull HL7MappingValidatorParser.AssertionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(@NotNull HL7MappingValidatorParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(@NotNull HL7MappingValidatorParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(@NotNull HL7MappingValidatorParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(@NotNull HL7MappingValidatorParser.LabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(@NotNull HL7MappingValidatorParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(@NotNull HL7MappingValidatorParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpression(@NotNull HL7MappingValidatorParser.BitShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpression(@NotNull HL7MappingValidatorParser.BitShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(@NotNull HL7MappingValidatorParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(@NotNull HL7MappingValidatorParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#assertionOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssertionOperator(@NotNull HL7MappingValidatorParser.AssertionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#assertionOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssertionOperator(@NotNull HL7MappingValidatorParser.AssertionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebuggerStatement(@NotNull HL7MappingValidatorParser.DebuggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebuggerStatement(@NotNull HL7MappingValidatorParser.DebuggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(@NotNull HL7MappingValidatorParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(@NotNull HL7MappingValidatorParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull HL7MappingValidatorParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull HL7MappingValidatorParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull HL7MappingValidatorParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull HL7MappingValidatorParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull HL7MappingValidatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull HL7MappingValidatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link HL7MappingValidatorParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetter(@NotNull HL7MappingValidatorParser.PropertyGetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link HL7MappingValidatorParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetter(@NotNull HL7MappingValidatorParser.PropertyGetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull HL7MappingValidatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull HL7MappingValidatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#elision}.
	 * @param ctx the parse tree
	 */
	void enterElision(@NotNull HL7MappingValidatorParser.ElisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#elision}.
	 * @param ctx the parse tree
	 */
	void exitElision(@NotNull HL7MappingValidatorParser.ElisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(@NotNull HL7MappingValidatorParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(@NotNull HL7MappingValidatorParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForVarStatement(@NotNull HL7MappingValidatorParser.ForVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForVarStatement(@NotNull HL7MappingValidatorParser.ForVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull HL7MappingValidatorParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull HL7MappingValidatorParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull HL7MappingValidatorParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull HL7MappingValidatorParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(@NotNull HL7MappingValidatorParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(@NotNull HL7MappingValidatorParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetParameterList(@NotNull HL7MappingValidatorParser.PropertySetParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetParameterList(@NotNull HL7MappingValidatorParser.PropertySetParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link HL7MappingValidatorParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetter(@NotNull HL7MappingValidatorParser.PropertySetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link HL7MappingValidatorParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetter(@NotNull HL7MappingValidatorParser.PropertySetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(@NotNull HL7MappingValidatorParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(@NotNull HL7MappingValidatorParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull HL7MappingValidatorParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull HL7MappingValidatorParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull HL7MappingValidatorParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull HL7MappingValidatorParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(@NotNull HL7MappingValidatorParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(@NotNull HL7MappingValidatorParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(@NotNull HL7MappingValidatorParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(@NotNull HL7MappingValidatorParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(@NotNull HL7MappingValidatorParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(@NotNull HL7MappingValidatorParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#futureReservedWord}.
	 * @param ctx the parse tree
	 */
	void enterFutureReservedWord(@NotNull HL7MappingValidatorParser.FutureReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#futureReservedWord}.
	 * @param ctx the parse tree
	 */
	void exitFutureReservedWord(@NotNull HL7MappingValidatorParser.FutureReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull HL7MappingValidatorParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull HL7MappingValidatorParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(@NotNull HL7MappingValidatorParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(@NotNull HL7MappingValidatorParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull HL7MappingValidatorParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull HL7MappingValidatorParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull HL7MappingValidatorParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull HL7MappingValidatorParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull HL7MappingValidatorParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull HL7MappingValidatorParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull HL7MappingValidatorParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull HL7MappingValidatorParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void enterInitialiser(@NotNull HL7MappingValidatorParser.InitialiserContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void exitInitialiser(@NotNull HL7MappingValidatorParser.InitialiserContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(@NotNull HL7MappingValidatorParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(@NotNull HL7MappingValidatorParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(@NotNull HL7MappingValidatorParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(@NotNull HL7MappingValidatorParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(@NotNull HL7MappingValidatorParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(@NotNull HL7MappingValidatorParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HL7MappingValidatorParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull HL7MappingValidatorParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HL7MappingValidatorParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull HL7MappingValidatorParser.LiteralContext ctx);
}