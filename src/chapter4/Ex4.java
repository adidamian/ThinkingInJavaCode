package chapter4;

class Def1 {
	public Def1() {
		System.out.println("print something");
	}
	Def1(String s){
		System.out.println(s);
	}
}


public class Ex4 {
 public static void main (String[] args) {
	 Def1 d = new Def1();
	 Def1 d1 = new Def1("print something else");
 }
}
