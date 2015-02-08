//generate 25 rand numbers and compare them to the next one

package chapter3;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		for (int i = 0; i < 25; i++) {
			int x = rand1.nextInt(100);
			int y = rand2.nextInt(100);
			if (x < y)
				System.out.println(x + " < " + y);
			else if (x > y)
				System.out.println(x + " > " + y);
			else
				System.out.println(x + " = " + y);
		}

	}
}
