import java.util.Scanner;

public class indexOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			System.out.println("Index of " + ch + " is " + str.indexOf(ch));
		}
	}

}
