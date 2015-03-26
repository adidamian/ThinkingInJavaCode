/*Write a switch statement for the enum in the previous example. 
 * For each case, output a description of that particular currency.
 */
package chapter4;

import chapter4.Ex21.Bills;





public class Ex22 {
	Bills b;
	public static void main(String[] args) {
		for(Bills b : Bills.values()) {
			System.out.print("Value: ");
			switch(b) {
				case ONE: System.out.println("$1"); break; 
				case FIVE: System.out.println("$5"); break;
				case TEN: System.out.println("$10"); break;
				case TWENTY: System.out.println("$20"); break; 
				case FIFTY: System.out.println("$50"); break;
				case HUNDRED: System.out.println("$100"); break;
				default: break;
			}
		}	
	}
}