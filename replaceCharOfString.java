import java.util.*;

public class replaceCharOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		char ch = 'z';
		char ch1 = 'M';
		int pos = 0;// starting of string
		int pos1 = str.length() - 1;// end of string

		StringBuilder string = new StringBuilder(str);
		string.setCharAt(pos, ch);
		string.setCharAt(pos + 1, ch);
		string.setCharAt(pos1, ch1);
		string.setCharAt(pos1 - 1, ch1);

		System.out.println(string);

	}

}
