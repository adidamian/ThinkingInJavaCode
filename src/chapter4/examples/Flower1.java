package chapter4.examples;

public class Flower1 {
	int petalCount = 0;
	String s = "initial value";

	Flower1(int petals) {
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount = "
				+ petalCount);
	}

	Flower1(String ss) {
		System.out.println("Constructor w/ String arg only, s = " + ss);
		s = ss;
	}

	Flower1(String s, int petals) {
		this(petals);
		this.s = s;
		System.out.println("String and int args");
	}

	Flower1() {
		this("hi", 47);
		System.out.println("default Constructor (no args)");
	}

	void printPetalCount() {
		System.out.println(" petalCount = " + petalCount + "s=" + s);
	}

	public static void main(String[] args) {
		Flower1 x = new Flower1();
		x.printPetalCount();
	}
}
