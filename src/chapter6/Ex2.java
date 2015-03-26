package chapter6;
/*Inherit a new class from class Detergent.
 *  Override scrub( ) and add a new method called sterilize( ).
 */
public class Ex2 extends Detergent {
	public void scrub() { append(" Sterilizer.scrub()"); }
	public void sterilize() { append(" sterilize()"); }
	public static void main(String[] args) {
		Ex2 x = new Ex2();
		x.dilute();
		x.apply();	
		x.scrub();
		x.foam();
		x.sterilize();
		System.out.println(x);
		System.out.println("Testing base class:");
		Detergent.main(args);
	}
}