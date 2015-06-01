package com.github.marcotabago.hl7mappingvalidator.engine;

import com.github.marcotabago.hl7mappingvalidator.model.AssertionsJavascriptWrapper;


public interface JavascriptTranslator {

	public abstract AssertionsJavascriptWrapper translate() throws Exception;

}