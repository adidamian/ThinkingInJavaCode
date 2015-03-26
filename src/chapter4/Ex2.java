/*Create a class eith a String fiels that is initialized at the point of definition,
 * and another one that is initialized by the constructor. What is the difference
 * 
 * 
 * */


package chapter4;

class Tester1 {
	String s1;
	String s2 = "hello" ;
	String s3;
	Tester1() {s3="good-bye" ;}
}

public class Ex2 {
 public static void main (String[] args) {
	 
	 Tester1 t =new Tester1();
	 System.out.println("t.s1: "+ t.s1);
	 System.out.println("t.s1: "+ t.s2);
	 System.out.println("t.s1: "+ t.s3);
 }
}
