/*Create a class called Dog containing two Strings: name and says. 
 * In main( ), create two dog objects with names “spot” (who says, “Ruff!”) 
 * and “scruffy” (who says, “Wurf!”).  * Then display their names 
 * and what they say.
 * 
 * Following Exercise 5, create a new Dog reference and assign it to spot’s object. 
 * Test for comparison using == and equals( ) for all references.
 */
package chapter2;

public class Ex6 {
	public static void main(String[] args) {
		Dog spot = new Dog("spot", "Ruff!");
		Dog scruffy = new Dog("scruffy", "Wurf!");
		System.out.println(spot.getName() + " " + spot.getSays());
		System.out.println(scruffy.getName() + " " + scruffy.getSays());

		Dog evil;
		evil = spot;
		// ==
		System.out.println("spot vs scruffy: " + (spot == scruffy));
		System.out.println("spot vs evil: " + (spot == evil));
		System.out.println("scruffy vs evil: " + (scruffy == evil));
		// equals()
		System.out.println("spot vs scruffy: " + spot.equals(scruffy));
		System.out.println("spot vs meat: " + spot.equals(evil));
		System.out.println("scruffy vs meat: " + scruffy.equals(evil));

	}
}
