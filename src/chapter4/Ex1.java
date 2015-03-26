/*create a class containing an uninitialized String reference
 * Demonstrate that this reference is initialized by Java to null 
 * 
 * 
 * */
package chapter4;
class Test {
	String s;
}
public class Ex1 {
public static void main(String[] args ) {
	Test t = new Test();
	System.out.println(t.s);
} 
}
