package com.factorytest.factory;

import com.factorytest.myclass.MyC;

public class MyCFactory implements CFactory<MyC> {
	private MyC myC;
	private String propPath;

	public MyCFactory(String propPath) {
		this.propPath = propPath;
	}

	public MyC createInstance(int a, int b) {
		MyC myC = this.getInstance(MyC.class);
		myC.set(a, b);
		return myC;
	}

	@Override
	public String getClassNameMapPropertiesPath() {
		return propPath;
	}

	@Override
	public MyC getSingletonInstance() {
		return myC;
	}

	@Override
	public void setSingletonInstance(MyC t) {
		this.myC=t;
	}
}
