package chapter1;
//Incrementable


	class StaticTest {
		static int i = 47;
	}
	class Incrementable {
		static void increment() { StaticTest.i++; }
	}
	public class Ex7 {
		public static void main(String[] args) {
		System.out.println("StaticTest.i= " + StaticTest.i);
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		
		System.out.println("st1.i= " + st1.i);
		System.out.println("st2.i= " + st2.i);
		
		Incrementable sf = new Incrementable();
		sf.increment();
		
		System.out.println("S-a apelat sf.increment()  ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		
		Incrementable.increment();
		System.out.println("S-a apelat  Incrementable.increment : ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		}
	}
	

