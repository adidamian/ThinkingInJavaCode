/*Write a method that takes two String arguments and uses all the boolean comparisons to compare 
the two Strings and System.out.println the results. For the == and !=, also perform the equals( ) test. In main( ), call your 
method with some different String objects.

x > y
x >= y
x < y
x <= y
x == y
x != y
!x
x && y //?
x || y //?

 * */

package chapter2;

public class Ex14 {
	static void Compare (String str1, String str2) {
      boolean result = false;
	 // result = (str1 > str2);
	  System.out.println("str1 > str2: " + result); 
	//  result = (str1 >= str2);
	  System.out.println("str1 >= str2: " + result); 
	//  result = (str1 < str2);
	  System.out.println("str1 < str2: " + result); 
	//  result = (str1 <= str2);
	  System.out.println("str1 <= str2: " + result); 
	  result = (str1 == str2);
	  System.out.println("str1 == str2: " + result); 
	  result = (str1 != str2);
	  System.out.println("str1 != str2: " + result); 
	 // result = (!str1);
	  System.out.println("!str1: " + result); 
	 // result = (str1 && str2);
	  System.out.println("str1 && str2: " + result); 
	 // result = (str1 || str2);
	  System.out.println("str1 || str2: " + result); 
	  result = str1.equals(str2);
	  System.out.println("str1.equals(str2): " + result); 
  }
  public static void main(String[] args) {
    Compare("a","b");	
	Compare("aaa","bb");
	Compare("a","a");		
  }
}