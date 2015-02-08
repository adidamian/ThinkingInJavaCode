package chapter1;

public class Ex6 {
	public static void main(String[] args) {
			class StoreSmth {
				int storage(String s) {
					return s.length() * 2;
				}	
			}
			StoreSmth x = new StoreSmth();
			System.out.println(x.storage("hello everybody"));		
		}
	}
	
	

