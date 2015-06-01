package com.github.marcotabago.hl7mappingvalidator.engine.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import com.github.marcotabago.hl7mappingvalidator.engine.JavascriptCompiler;
import com.github.marcotabago.hl7mappingvalidator.model.AssertionsJavascriptWrapper;
import com.github.marcotabago.hl7mappingvalidator.model.MappingAssertionStatement;

public class AssertionsJavascriptCompiler implements JavascriptCompiler {
	
	private List<AssertionsJavascriptWrapper> assertionsJavascriptWrappers;
	
	private List<MappingAssertionStatement> mappingAssertionStatements;

	/* (non-Javadoc)
	 * @see com.github.marcotabago.hl7mappingvalidator.grammar.impl.JavascriptCompiler#setAssertionsJavascriptWrappers()
	 */
	@Override
	public void setAssertionsJavascriptWrappers(List<AssertionsJavascriptWrapper> assertionsJavascriptWrappers) {
		this.assertionsJavascriptWrappers = assertionsJavascriptWrappers;
	}

	public AssertionsJavascriptCompiler() {
		this.assertionsJavascriptWrappers = new ArrayList<AssertionsJavascriptWrapper>();
		this.mappingAssertionStatements = new ArrayList<MappingAssertionStatement>();
	}
	
	/* (non-Javadoc)
	 * @see com.github.marcotabago.hl7mappingvalidator.grammar.impl.JavascriptCompiler#addAssertionsJavascriptWrapper(com.github.marcotabago.hl7mappingvalidator.grammar.impl.AssertionsJavascriptWrapper)
	 */
	@Override
	public void addAssertionsJavascriptWrapper(AssertionsJavascriptWrapper assertionsJavascriptWrapper) {
		this.assertionsJavascriptWrappers.add(assertionsJavascriptWrapper);
	}
	
	/* (non-Javadoc)
	 * @see com.github.marcotabago.hl7mappingvalidator.grammar.impl.JavascriptCompiler#removeAssertionsJavascriptWrapper(com.github.marcotabago.hl7mappingvalidator.grammar.impl.AssertionsJavascriptWrapper)
	 */
	@Override
	public void removeAssertionsJavascriptWrapper(AssertionsJavascriptWrapper assertionsJavascriptWrapper) {
		this.assertionsJavascriptWrappers.remove(assertionsJavascriptWrapper);
	}
	
	/* (non-Javadoc)
	 * @see com.github.marcotabago.hl7mappingvalidator.grammar.impl.JavascriptCompiler#compile()
	 */
	@Override
	public List<MappingAssertionStatement> compile() throws Exception {
		for (AssertionsJavascriptWrapper assertionsJavascriptWrapper : this.assertionsJavascriptWrappers) {
			Object compiledJavascriptObject = compileJavascriptAssertions(assertionsJavascriptWrapper);
			List<MappingAssertionStatement> mappingAssertionStatementsForObject = generateAssertionStatements(compiledJavascriptObject);
			this.mappingAssertionStatements.addAll(mappingAssertionStatementsForObject);
		}		
		return this.mappingAssertionStatements;
	}
	
	private Object compileJavascriptAssertions(AssertionsJavascriptWrapper assertionsJavascriptWrapper) throws Exception {

		String javascriptText = assertionsJavascriptWrapper.getJavascriptText();	
		HashMap<String, Object> referencedObjects = assertionsJavascriptWrapper.getReferencedObjects();
		
		Object compiledJavascriptObject = null;
		Context rhinoContext = Context.enter();

		try {
			ScriptableObject scope = rhinoContext.initStandardObjects();
			
			for (String key : referencedObjects.keySet()) {
				Object referencedObject = referencedObjects.get(key);
				
				Object wrappedObject = Context.javaToJS(referencedObject, scope);
				ScriptableObject.putProperty(scope, key,
						wrappedObject);
			}

			Scriptable that = rhinoContext.newObject(scope);
			Function fct = rhinoContext.compileFunction(scope,
					javascriptText, "script", 1, null);
			Object result = fct
					.call(rhinoContext, scope, that, new Object[] {});
			compiledJavascriptObject = result == Context.getUndefinedValue() ? null : Context
					.jsToJava(result, Object.class);
		} catch (EvaluatorException ee) {
			ee.printStackTrace();
		} finally {
			Context.exit();
		}
		
		return compiledJavascriptObject;
		
	}
	
	private List<MappingAssertionStatement> generateAssertionStatements(Object compiledJavascriptObject) {
		List<MappingAssertionStatement> assertionStatements = new ArrayList<MappingAssertionStatement>();
		if (compiledJavascriptObject != null && compiledJavascriptObject instanceof NativeArray) {
			NativeArray array = (NativeArray) compiledJavascriptObject;
			for (Object object : array) {
				NativeObject nativeObject = (NativeObject) object;
				String actualValuePath = (String) nativeObject
						.get("actualValuePath");
				Object actualValue = nativeObject.get("actualValue");
				String operator = (String) nativeObject.get("operator");
				Object expectedValue = nativeObject.get("expectedValue");
				assertionStatements.add(new MappingAssertionStatement(
						actualValuePath, actualValue, operator, expectedValue));
			}
		}
		return assertionStatements;
	}

}
