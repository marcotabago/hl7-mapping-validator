package com.github.marcotabago.hl7mappingvalidator.model;

public class MappingAssertionStatement {

	private String actualValuePath;

	private Object actualValue;

	private Operator operator;

	private Object expectedValue;

	public enum Operator {
		AssertLessThan, AssertMoreThan, AssertLessThanEquals, AssertGreaterThanEquals, AssertEquals, AssertNotEquals
	}

	public MappingAssertionStatement(String actualValuePath,
			Object actualValue, String operatorString, Object expectedValue) {
		super();
		this.actualValuePath = actualValuePath;
		this.actualValue = actualValue;
		this.operator = Operator.AssertEquals;
		if (operatorString.equals("?!")) {
			this.operator = Operator.AssertNotEquals;
		} else if (operatorString.equals("?<")) {
			this.operator = Operator.AssertLessThan;
		} else if (operatorString.equals("?<=")) {
			this.operator = Operator.AssertLessThanEquals;
		} else if (operatorString.equals("?>")) {
			this.operator = Operator.AssertMoreThan;
		} else if (operatorString.equals("?>=")) {
			this.operator = Operator.AssertGreaterThanEquals;
		}
		this.expectedValue = expectedValue;
	}

	public String getActualValuePath() {
		return actualValuePath;
	}

	public void setActualValuePath(String actualValuePath) {
		this.actualValuePath = actualValuePath;
	}

	public Object getActualValue() {
		return actualValue;
	}

	public void setActualValue(Object actualValue) {
		this.actualValue = actualValue;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Object getExpectedValue() {
		return expectedValue;
	}

	public void setExpectedValue(Object expectedValue) {
		this.expectedValue = expectedValue;
	}

}
