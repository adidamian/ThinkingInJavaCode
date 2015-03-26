package chapter4.examples;

 class DogNoise {
   void bark() {System.out.println("shut up");}
   void bark(char c) {System.out.println("character");}
   void bark(byte b) {System.out.println("bytesnm");}
   void bark(short s) {System.out.println("shutupalready");}
   void bark(int i) {System.out.println("shut up i");}
   void bark(float f) {System.out.println("shut up f");}
   void bark(double d) {System.out.println("shut up d");}
   

 
 
 }


public class Dog {
	public static void main(String[] args){
		DogNoise d=new DogNoise();
		char c = 'c';
		byte n = 0;
		short s = 0;
		d.bark();
		
	    d.bark(1);
	    d.bark(1L);
	    d.bark(1.0f);
	    d.bark(1.0);
	}
	
}