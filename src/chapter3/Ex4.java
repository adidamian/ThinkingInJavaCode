//prime numbers using nested for loops
package chapter3;
import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++ ) {
			System.out.println("i: "+i);
			int factors = 0;
			for(int j = 1; j < (i + 2)/2; j++ ) {
				System.out.println("j :" + j);
				if((i % j) == 0) factors++; 
				System.out.println("fact :" +factors);
			}
			if(factors < 2) System.out.println(i + " is prime");
		}
	}
}
