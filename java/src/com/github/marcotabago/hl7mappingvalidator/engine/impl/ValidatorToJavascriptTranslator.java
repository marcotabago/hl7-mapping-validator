package com.github.marcotabago.hl7mappingvalidator.engine.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.IOUtils;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.util.Terser;
import ca.uhn.hl7v2.validation.ValidationContext;
import ca.uhn.hl7v2.validation.impl.NoValidation;

import com.github.marcotabago.hl7mappingvalidator.engine.JavascriptTranslator;
import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorLexer;
import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorParser;
import com.github.marcotabago.hl7mappingvalidator.grammar.HL7MappingValidatorParser.ProgramContext;
import com.github.marcotabago.hl7mappingvalidator.grammar.impl.JavascriptCodeGenerator;
import com.github.marcotabago.hl7mappingvalidator.grammar.impl.ValidatorErrorListener;
import com.github.marcotabago.hl7mappingvalidator.model.AssertionsJavascriptWrapper;

public class ValidatorToJavascriptTranslator implements JavascriptTranslator {
	
	public static String DESTINATION_TERSER_REFERENCED_OBJECT_NAME = "destinationTerser";
	
	public static String SOURCE_TERSER_REFERENCED_OBJECT_NAME = "sourceTerser";
	
	private String validatorRawContent;
	
	private String sourceHl7Message;
	
	private String destinationHl7Message;
	
	public ValidatorToJavascriptTranslator(InputStream inputStream, String sourceHl7Message, String destinationHl7Message) throws IOException {		
		StringWriter writer = new StringWriter();
		IOUtils.copy(inputStream, writer);
		this.validatorRawContent = writer.toString();	
		this.sourceHl7Message = sourceHl7Message;
		this.destinationHl7Message = destinationHl7Message;
	}
	
	/* (non-Javadoc)
	 * @see com.github.marcotabago.hl7mappingvalidator.grammar.impl.JavascriptTranslator#translate()
	 */
	@Override
	public AssertionsJavascriptWrapper translate() throws Exception {
		
		ANTLRInputStream input = new ANTLRInputStream(this.validatorRawContent);
		HL7MappingValidatorLexer lexer = new HL7MappingValidatorLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HL7MappingValidatorParser parser = new HL7MappingValidatorParser(tokens);
		ValidatorErrorListener errorListener = new ValidatorErrorListener();
		parser.addErrorListener(errorListener);
		
		ProgramContext context = parser.program();
		
		if (errorListener.getSyntaxErrrors().size() > 0) {
			StringBuffer errorMessageBuffer = new StringBuffer();
			errorMessageBuffer.append("Syntax errors found in HL7 Mapping Validator content: \n");
			for (String syntaxError : errorListener.getSyntaxErrrors()) {
				errorMessageBuffer.append("\t" + syntaxError + "\n");
			}
			throw new Exception (errorMessageBuffer.toString());
		}
		
		ParseTreeWalker walker = new ParseTreeWalker();
		JavascriptCodeGenerator listener = new JavascriptCodeGenerator(parser);
		walker.walk(listener, context);
		
		String javascriptFunctionText = listener.getGeneratedJavascript();
		
		AssertionsJavascriptWrapper javascriptWrapper = new AssertionsJavascriptWrapper(javascriptFunctionText);
		
		ValidationContext validationContext = new NoValidation();
		HapiContext hapiContext = new DefaultHapiContext(validationContext);
		Parser hapiParser = hapiContext.getGenericParser();
		
		Message sourceHl7 = hapiParser.parse(this.sourceHl7Message);
		Terser terserSource = new Terser(sourceHl7);
		javascriptWrapper.addReferencedObject(SOURCE_TERSER_REFERENCED_OBJECT_NAME, terserSource);
		
		Message targetHl7 = hapiParser.parse(this.destinationHl7Message);
		Terser terserTarget = new Terser(targetHl7);
		javascriptWrapper.addReferencedObject(DESTINATION_TERSER_REFERENCED_OBJECT_NAME, terserTarget);		
		
		return javascriptWrapper;
		
	}

}
