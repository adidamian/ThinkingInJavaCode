package chapter3;

import java.util.*;

public class Ex3 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		for (int i = 0; i < 25; i++) {
			int x = rand1.nextInt();
			int y = rand2.nextInt();
			if (x < y)
				System.out.println(x + " < " + y);
			else if (x > y)
				System.out.println(x + " > " + y);
			else
				System.out.println(x + " = " + y);
		}
		// Scanner keyboard = new Scanner(System.in);
		Random rand3 = new Random();
		Random rand4 = new Random();
		while (true) {
			// for(int i = 0; i < 25; i++) {
			int x = rand3.nextInt(100);
			int y = rand4.nextInt(100);
			if (x < y)
				System.out.println(x + " < " + y);
			else if (x > y)
				System.out.println(x + " > " + y);
			else if (x == y)
				System.out.println(x + " = " + y);
			if (x == 99 || y == 99)
				 break;
//				return;
		}
	}
}
