import java.util.*;

public class concateStrings {
	public static void main(String[] args) {
		String sb = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of string want to append : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("enter the string : ");
			String str = sc.next();
			sb += str;

		}

		System.out.println("The concatenated string is : "+sb);

	}
}
