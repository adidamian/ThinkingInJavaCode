package chapter3;

import java.util.Scanner;

public class Ex4_1{
   public static void main(String args[]){
      System.out.print("Enter your sentence: ");
      Scanner sc = new Scanner (System.in);

      while (sc.hasNext() == true ) {
        String s1 = sc.next();
        System.out.println(s1);
        if (s1.equals("c")) {
            break;
      }
      }
      System.out.println("The loop has been ended"); // This somehow never get printed.
   }
}