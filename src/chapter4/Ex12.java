/*Create a class called Tank that can be filled and emptied, and has a termination 
 * condition that it must be empty when the object is cleaned up. Write a finalize( ) 
 * that verifies this termination condition. In main( ), test the possible scenarios 
 * that can occur when your Tank is used.
*/
package chapter4;

class Tank {
	int howFull = 0;
	Tank() { this(0); }
	Tank(int plin) {
		howFull = plin;		
	}
	void sayHowFull() {
		if(howFull == 0) System.out.println("Tank is empty");
		else System.out.println("Tank filling status = " + howFull);
	}
	void empty() {
		howFull = 0;
	}
	protected void finalize() {
		if(howFull != 0)
			System.out.println("Error: Tank not empty");
		
	}
}

public class Ex12 {
	public static void main(String[] args) {
		Tank tank1 = new Tank();
		Tank tank2 = new Tank(3);
		Tank tank3 = new Tank(5);
		
		tank2.empty();
		
		new Tank(6);
		
		System.out.println("Check tanks:");
		System.out.println("tank1: ");
		tank1.sayHowFull();
		System.out.println("tank2: ");
		tank2.sayHowFull();
		System.out.println("tank3: ");
		tank3.sayHowFull();
		System.out.println("first forced gc():");
		System.gc();
		
		// Force finalization on exit 
				
		System.out.println("last forced gc():");
		System.gc();
	}	
}