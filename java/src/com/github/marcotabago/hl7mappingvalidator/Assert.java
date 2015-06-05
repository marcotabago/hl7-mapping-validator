package com.github.marcotabago.hl7mappingvalidator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
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
			String destinationMessage,
			InputStream hl7MappingValidatorInputStream) throws Exception {

		JavascriptTranslator translator = new ValidatorToJavascriptTranslator(
				hl7MappingValidatorInputStream, sourceMessage,
				destinationMessage);
		AssertionsJavascriptWrapper assertionsJavascriptWrapper = translator
				.translate();

		JavascriptCompiler compiler = new AssertionsJavascriptCompiler();
		compiler.addAssertionsJavascriptWrapper(assertionsJavascriptWrapper);
		List<MappingAssertionStatement> mappingAssertionStatements = compiler
				.compile();

		runAssertions(mappingAssertionStatements);

	}

	public static void assertHl7Mapping(String sourceMessage,
			String destinationMessage, String hl7MappingValidatorContent)
			throws Exception {

		InputStream hl7MappingValidatorInputStream = IOUtils
				.toInputStream(hl7MappingValidatorContent);
		assertHl7Mapping(sourceMessage, destinationMessage,
				hl7MappingValidatorInputStream);

	}

	public static void assertHl7Mapping(String sourceMessage,
			String destinationMessage, File hl7MappingValidatorFile)
			throws Exception {

		String hl7MappingValidatorContent = FileUtils
				.readFileToString(hl7MappingValidatorFile);
		assertHl7Mapping(sourceMessage, destinationMessage,
				hl7MappingValidatorContent);

	}

	public static void assertHl7Mapping(String destinationMessage,
			InputStream hl7MappingValidatorInputStream) throws Exception {

		assertHl7Mapping(null, destinationMessage,
				hl7MappingValidatorInputStream);

	}

	public static void assertHl7Mapping(String destinationMessage,
			String hl7MappingValidatorContent) throws Exception {

		InputStream hl7MappingValidatorInputStream = IOUtils
				.toInputStream(hl7MappingValidatorContent);
		assertHl7Mapping(null, destinationMessage,
				hl7MappingValidatorInputStream);

	}

	public static void assertHl7Mapping(String destinationMessage,
			File hl7MappingValidatorFile) throws Exception {

		String hl7MappingValidatorContent = FileUtils
				.readFileToString(hl7MappingValidatorFile);
		assertHl7Mapping(null, destinationMessage, hl7MappingValidatorContent);

	}

	private static void runAssertions(
			List<MappingAssertionStatement> mappingAssertionStatements) {

		for (MappingAssertionStatement statement : mappingAssertionStatements) {
			if (statement.getOperator() == Operator.AssertEquals) {
				assertEquals(statement.getActualValuePath(),
						statement.getExpectedValue(),
						statement.getActualValue());
			} else if (statement.getOperator() == Operator.AssertNotEquals) {
				assertTrue(statement.getActualValuePath(),
						statement.getExpectedValue() != statement
								.getActualValue());
			} else if (statement.getOperator() == Operator.AssertLessThan
					|| statement.getOperator() == Operator.AssertLessThanEquals
					|| statement.getOperator() == Operator.AssertMoreThan
					|| statement.getOperator() == Operator.AssertGreaterThanEquals) {
				Object actualValue = statement.getActualValue();
				Double actualDoubleValue = null;
				if (actualValue != null) {
					if (actualValue instanceof Integer) {
						actualDoubleValue = ((Integer) actualValue) * 1.0d;
					} else if (actualValue instanceof Long) {
						actualDoubleValue = ((Long) actualValue) * 1.0d;
					} else if (actualValue instanceof Float) {
						actualDoubleValue = ((Float) actualValue) * 1.0d;
					} else if (actualValue instanceof Double) {
						actualDoubleValue = ((Double) actualValue) * 1.0d;
					}
				}

				Object expectedValue = statement.getExpectedValue();
				Double expectedDoubleValue = null;
				if (expectedValue != null) {
					if (expectedValue instanceof Integer) {
						expectedDoubleValue = ((Integer) expectedValue) * 1.0d;
					} else if (expectedValue instanceof Long) {
						expectedDoubleValue = ((Long) expectedValue) * 1.0d;
					} else if (expectedValue instanceof Float) {
						expectedDoubleValue = ((Float) expectedValue) * 1.0d;
					} else if (expectedValue instanceof Double) {
						expectedDoubleValue = ((Double) expectedValue) * 1.0d;
					}
				}

				if (statement.getOperator() == Operator.AssertLessThan) {
					String errorMessage = statement.getActualValuePath()
							+ ": Evaluated value " + actualDoubleValue
							+ " is not less than " + expectedDoubleValue;
					assertTrue(errorMessage,
							actualDoubleValue < expectedDoubleValue);
				} else if (statement.getOperator() == Operator.AssertLessThanEquals) {
					String errorMessage = statement.getActualValuePath()
							+ ": Evaluated value " + actualDoubleValue
							+ " is not less than or equal to "
							+ expectedDoubleValue;
					assertTrue(errorMessage,
							actualDoubleValue <= expectedDoubleValue);
				} else if (statement.getOperator() == Operator.AssertMoreThan) {
					String errorMessage = statement.getActualValuePath()
							+ ": Evaluated value " + actualDoubleValue
							+ " is not greater than " + expectedDoubleValue;
					assertTrue(errorMessage,
							actualDoubleValue > expectedDoubleValue);
				} else if (statement.getOperator() == Operator.AssertGreaterThanEquals) {
					String errorMessage = statement.getActualValuePath()
							+ ": Evaluated value " + actualDoubleValue
							+ " is not greater than or equal to "
							+ expectedDoubleValue;
					assertTrue(errorMessage,
							actualDoubleValue >= expectedDoubleValue);
				}

			} else if (statement.getOperator() == Operator.AssertIn || statement.getOperator() == Operator.AssertNotIn) {
				Object[] objectArray = (Object[]) statement.getExpectedValue();
				StringBuilder builder = new StringBuilder();
				builder.append("[");
				for(int i = 0; i < objectArray.length; i++) {
					Object obj = objectArray[i];
				    builder.append(obj.toString());
				    if (i < (objectArray.length - 1)) {
				    	builder.append(", ");
				    }
				}
				builder.append("]");
				boolean arrayContainsValue = Arrays.asList(objectArray).contains(statement.getActualValue());
				if (statement.getOperator() == Operator.AssertIn) {
					String errorMessage = statement.getActualValuePath()
							+ ": Evaluated value " + statement.getActualValue()
							+ " is not in " + builder.toString();
					assertTrue(errorMessage, arrayContainsValue);
				} else if (statement.getOperator() == Operator.AssertNotIn) {
					String errorMessage = statement.getActualValuePath()
							+ ": Evaluated value " + statement.getActualValue()
							+ " is in " + builder.toString();
					assertTrue(errorMessage, !arrayContainsValue);
				}
			}
		}

	}

}
