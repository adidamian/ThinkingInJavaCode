/* Create a class with a constructor that takes a String argument. During
* constriction, print the argument. Create and array of object references to this
* class, but don't actually create objects to assign into the array. When you run
* the program, notice whether the initialization messages from the constructor
* are printed.
*/
package chapter4;

class InitTest {
	InitTest(String s) {
		System.out.println("InitTest()");
		System.out.println(s);
	}
}

public class Ex17 {
	public static void main(String[] args) {
		InitTest[] it = new InitTest[10];
		for(int i=0;i< it.length;i++)
			it[i] = new InitTest(Integer.toString(i));
	}
}