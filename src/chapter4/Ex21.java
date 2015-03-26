/*Create an enum of the least-valuable six types of paper currency. 
 * Loop through the values( ) and print each value and its ordinal( ).
 */
package chapter4;

public class Ex21 {
	public enum Bills {
		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
	}
	public static void main(String[] args) {
		for(Bills b : Bills.values())
			System.out.println(b + ", ordinal " + b.ordinal());	
	}	
}