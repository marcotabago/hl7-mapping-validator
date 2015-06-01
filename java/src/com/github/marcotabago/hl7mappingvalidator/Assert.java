package com.github.marcotabago.hl7mappingvalidator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import com.github.marcotabago.hl7mappingvalidator.engine.JavascriptCompiler;
import com.github.marcotabago.hl7mappingvalidator.engine.JavascriptTranslator;
import com.github.marcotabago.hl7mappingvalidator.engine.impl.ValidatorToJavascriptTranslator;
import com.github.marcotabago.hl7mappingvalidator.engine.impl.AssertionsJavascriptCompiler;
import com.github.marcotabago.hl7mappingvalidator.model.AssertionsJavascriptWrapper;
import com.github.marcotabago.hl7mappingvalidator.model.MappingAssertionStatement;
import com.github.marcotabago.hl7mappingvalidator.model.MappingAssertionStatement.Operator;

public abstract class Assert {

	public static void assertHl7Mapping(String sourceMessage,
			String destinationMessage, InputStream hl7MappingValidatorInputStream)
			throws Exception {
		
		JavascriptTranslator translator = new ValidatorToJavascriptTranslator(hl7MappingValidatorInputStream, sourceMessage, destinationMessage);
		AssertionsJavascriptWrapper assertionsJavascriptWrapper = translator.translate();
		
		JavascriptCompiler compiler = new AssertionsJavascriptCompiler();
		compiler.addAssertionsJavascriptWrapper(assertionsJavascriptWrapper);
		List<MappingAssertionStatement> mappingAssertionStatements = compiler.compile();
		
		runAssertions(mappingAssertionStatements);
		
	}
	
	private static void runAssertions(List<MappingAssertionStatement> mappingAssertionStatements) {
		
		for (MappingAssertionStatement statement : mappingAssertionStatements) {
			if (statement.getOperator() == Operator.AssertEquals) {
				assertEquals(statement.getActualValuePath(),
						statement.getExpectedValue(),
						statement.getActualValue());
			} else if (statement.getOperator() == Operator.AssertNotEquals) {
				assertNotEquals(statement.getActualValuePath(),
						statement.getExpectedValue(),
						statement.getActualValue());
			} else if (statement.getOperator() == Operator.AssertLessThan) {
				String errorMessage = statement.getActualValuePath() + ": Evaluated value " + (Integer) statement
						.getActualValue() + " is not less than " + (Integer) statement
						.getExpectedValue();
				assertTrue(errorMessage, (Integer) statement
						.getActualValue() < (Integer) statement
						.getExpectedValue());
			} else if (statement.getOperator() == Operator.AssertLessThanEquals) {
				String errorMessage = statement.getActualValuePath() + ": Evaluated value " + (Integer) statement
						.getActualValue() + " is not less than or equal to " + (Integer) statement
						.getExpectedValue();
				assertTrue(errorMessage, (Integer) statement
						.getActualValue() <= (Integer) statement
						.getExpectedValue());
			} else if (statement.getOperator() == Operator.AssertMoreThan) {
				String errorMessage = statement.getActualValuePath() + ": Evaluated value " + (Integer) statement
						.getActualValue() + " is not greater than " + (Integer) statement
						.getExpectedValue();
				assertTrue(errorMessage, (Integer) statement
						.getActualValue() > (Integer) statement
						.getExpectedValue());
			} else if (statement.getOperator() == Operator.AssertGreaterThanEquals) {
				String errorMessage = statement.getActualValuePath() + ": Evaluated value " + (Integer) statement
						.getActualValue() + " is not greater than or equal to " + (Integer) statement
						.getExpectedValue();
				assertTrue(errorMessage, (Integer) statement
						.getActualValue() >= (Integer) statement
						.getExpectedValue());
			}
		}
		
	}
	
	public static void assertHl7Mapping(String sourceMessage,
			String destinationMessage, String hl7MappingValidatorContent)
			throws Exception {
		
		InputStream hl7MappingValidatorInputStream = IOUtils.toInputStream(hl7MappingValidatorContent);
		assertHl7Mapping(sourceMessage, destinationMessage, hl7MappingValidatorInputStream);

	}

	public static void assertHl7Mapping(String sourceMessage,
			String destinationMessage, File hl7MappingValidatorFile) throws Exception {
		
		String hl7MappingValidatorContent = FileUtils.readFileToString(hl7MappingValidatorFile);
		assertHl7Mapping(sourceMessage, destinationMessage, hl7MappingValidatorContent);
		
	}

}
