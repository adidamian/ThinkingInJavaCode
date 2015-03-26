package chapter6;
/* Create a simple class. Inside a second class, define a reference to an object of
* the first class. Use lazy initialization to instantiate this object.
*/ 
// Class Plane

class Engine {
	private String s;
	Engine() {
		System.out.println("Engine()");
		s = "Constructed";
	}
	public String toString() { return s; }
}

public class Ex1 {
	private String fuselage, wings, tail;
	private Engine e;
	public Ex1() {
		System.out.println("Inside Airplane()");
		fuselage = "Body";
		wings = "Airfoils";
		tail = "Empennage";				
	}
	public String toString() { 
		if(e == null) // lazy (delayed) initialization:
			e = new Engine();
		return "fuselage = " + fuselage + ", " +
			"wings = " + wings + ", " +
			"tail = " + tail + ", " +
			"Engine = " + e;
	}
	public static void main(String[] args) {
		Ex1 N1234 = new Ex1();
		System.out.print(N1234);
	}
}