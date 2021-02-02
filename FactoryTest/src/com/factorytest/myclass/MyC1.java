package com.factorytest.myclass;

public class MyC1 extends MyC {
	int a, b;
	int sum;

	@Override
	public void show() {
		System.out.printf("MyC1 show: a=%d and b=%d , sum=%d\n", this.a, this.b, this.sum);
	}

	@Override
	public void set(int a, int b) {
		this.a = a;
		this.b = b;
		this.sum += this.a + this.b;
	}
}