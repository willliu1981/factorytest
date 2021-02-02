package com.factorytest.myclass;

public class MyC2 extends MyC {
	int a, b;
	int sum;

	@Override
	public void show() {
		System.out.printf("MyC2 show: a=%d and b=%d , sum=%d\n", this.a, this.b, this.sum);
	}

	@Override
	public void set(int a, int b) {
		this.a = a * 2;
		this.b = b * 2;
		this.sum += this.a + this.b;
	}
}