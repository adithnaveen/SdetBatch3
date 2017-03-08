package com.fannie.inhe;

class A {
	A() {
		super();
		System.out.println("Hi i'm from A");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("Hi i'm from B");
	}
}

class C extends B {
	C() {
		super();
		System.out.println("hi i'm from C");
	}
}

public class InheEx {
	public static void main(String[] args) {
		C objC = new C();
	}
}
