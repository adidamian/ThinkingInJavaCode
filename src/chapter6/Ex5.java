package chapter6;

class A {
	static{
		System.out.println("static A");
	}
	
	A() {
		System.out.println("A()");
	}
}

class B extends A {
	static{
		System.out.println("static B");
	}
	
	B() {
		super();
		System.out.println("B()");
	}
}

public class Ex5{
//	B b = new B(); // construieste un A si apoi un B

	public static void main(String[] args) {
		new B();// va constru A prima data
	}
}