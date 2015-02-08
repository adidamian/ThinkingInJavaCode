package chapter2;

/*
 Exercise 7: (3) Write a program that simulates coin-flipping.

 false - heads
 true - tails
 */

import java.util.*;

public class Ex7 {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("false - heads");
		System.out.println("true - tails");
		System.out.println(rand.nextBoolean());
	}
}
