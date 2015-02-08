/*Create a class called Dog containing two Strings: name and says. 
 * In main( ), create two dog objects with names “spot” (who says, “Ruff!”) 
 * and “scruffy” (who says, “Wurf!”).  * Then display their names 
 * and what they say.
 * 
 * 
 */
package chapter2;

class Dog {
	private String dogName;
	private String dogSays;

	Dog(String name, String says) {
		dogName = name;
		dogSays = says;
	}

	public String getName() {
		return dogName;
	}

	public String getSays() {
		return dogSays;
	}
}

public class Ex5 {
	public static void main(String[] args) {
		Dog spot = new Dog("spot", "Ruff!");
		Dog scruffy = new Dog("scruffy", "Wurf!");
		System.out.println(spot.getName() + " " + spot.getSays());
		System.out.println(scruffy.getName() + " " + scruffy.getSays());
	}
}