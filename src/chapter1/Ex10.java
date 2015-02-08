package chapter1;

// Write a program that prints three arguments taken from the command line. To do 
// this you'll need to index into the command-line array of Strings.
public class Ex10 {

	public static void main(String[] args) {

		for (int j = 0; j < args.length; j++) {
			if ((args.length != 0) && (j < 3))
				System.out.println(args[j]);
		}
	}
}
