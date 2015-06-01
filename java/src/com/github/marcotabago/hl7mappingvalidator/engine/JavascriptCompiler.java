package com.github.marcotabago.hl7mappingvalidator.engine;

import java.util.List;

import com.github.marcotabago.hl7mappingvalidator.model.AssertionsJavascriptWrapper;
import com.github.marcotabago.hl7mappingvalidator.model.MappingAssertionStatement;

public interface JavascriptCompiler {

	public abstract void addAssertionsJavascriptWrapper(
			AssertionsJavascriptWrapper assertionsJavascriptWrapper);

	public abstract void removeAssertionsJavascriptWrapper(
			AssertionsJavascriptWrapper assertionsJavascriptWrapper);

	public void setAssertionsJavascriptWrappers(
			List<AssertionsJavascriptWrapper> assertionsJavascriptWrappers);
	
	public abstract List<MappingAssertionStatement> compile() throws Exception;

}