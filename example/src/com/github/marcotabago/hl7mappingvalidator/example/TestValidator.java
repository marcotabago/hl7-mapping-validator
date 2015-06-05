package com.github.marcotabago.hl7mappingvalidator.example;
import static com.github.marcotabago.hl7mappingvalidator.Assert.assertHl7Mapping;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;


public class TestValidator {

	@Test
	public void test() throws Exception {
		
		File hl7MappingValidatorFile = new File("test.js");
		
		String sourceMessage = FileUtils
				.readFileToString(new File(
						"test-hl7-messages/source-hl7-message.txt"));
		
		String destinationMessage = FileUtils
				.readFileToString(new File(
						"test-hl7-messages/transformed-hl7-message.txt"));
		
		assertHl7Mapping(sourceMessage, destinationMessage, hl7MappingValidatorFile);
		
	}

}
