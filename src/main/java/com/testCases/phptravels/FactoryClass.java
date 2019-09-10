package com.testCases.phptravels;

import org.testng.annotations.Factory;

public class FactoryClass {
	@Factory
	public Object[] getClassInstances() {
		Object[] data = new Object[5];
		data[0] = new TestClass1();
		data[1] = new TestClass1();
		data[2] = new TestClass1();
		data[3] = new TestClass1();
		data[4] = new TestClass1();
		return data;
	}

}
