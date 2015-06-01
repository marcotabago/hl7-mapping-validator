package com.github.marcotabago.hl7mappingvalidator.model;

import java.util.ArrayList;
import java.util.List;

import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;

public class CompiledJavascriptAssertions {
	
	private Object compiledJavascriptObject;
	
	private List<MappingAssertionStatement> assertionStatementMetadataList;

	public CompiledJavascriptAssertions(Object compiledJavascriptObject) {
		super();
		this.compiledJavascriptObject = compiledJavascriptObject;
		this.assertionStatementMetadataList = new ArrayList<MappingAssertionStatement>();
	}
	
	public List<MappingAssertionStatement> getAssertionStatementMetadataList() {
		if (this.compiledJavascriptObject != null && this.compiledJavascriptObject instanceof NativeArray) {
			NativeArray array = (NativeArray) this.compiledJavascriptObject;
			for (Object object : array) {
				NativeObject nativeObject = (NativeObject) object;
				String actualValuePath = (String) nativeObject
						.get("actualValuePath");
				Object actualValue = nativeObject.get("actualValue");
				String operator = (String) nativeObject.get("operator");
				Object expectedValue = nativeObject.get("expectedValue");
				this.assertionStatementMetadataList.add(new MappingAssertionStatement(
						actualValuePath, actualValue, operator, expectedValue));
			}
		}
		return this.assertionStatementMetadataList;
	}

}
