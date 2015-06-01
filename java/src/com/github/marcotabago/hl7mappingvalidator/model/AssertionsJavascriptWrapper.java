package com.github.marcotabago.hl7mappingvalidator.model;

import java.util.HashMap;

public class AssertionsJavascriptWrapper {
	
	private String javascriptText;
	
	public String getJavascriptText() {
		return javascriptText;
	}

	private HashMap<String, Object> referencedObjects;

	public AssertionsJavascriptWrapper(String javascriptText) {
		super();
		this.javascriptText = javascriptText;
		this.referencedObjects = new HashMap<String, Object>();
	}
	
	public void addReferencedObject(String varName, Object object) {
		this.referencedObjects.put(varName, object);
	}
	
	public void removeReferencedObject(String varName) {
		this.referencedObjects.remove(varName);
	}
	
	public Object getReferencedObject(String varName) {
		return this.referencedObjects.get(varName);
	}

	public HashMap<String, Object> getReferencedObjects() {
		return referencedObjects;
	}
	
}
