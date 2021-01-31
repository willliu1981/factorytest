package com.factorytest.main;

import com.factorytest.app.App;
import com.factorytest.factory.MyC;
import com.factorytest.factory.MyCFactory;

public class FactoryTest {

	public static void main(String[] args) {
		MyC myC = null;
		int a = 2, b = 3;
		MyCFactory factory = new MyCFactory(App.getClassPath());
		myC = factory.createInstance(a, b);
		myC.show();

		a = 10;
		b = 10;
		myC = factory.createInstance(a, b);
		myC.show();
	}
}
