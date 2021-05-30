import java.util.*;

/**
 * 
 */

/**
 * @author Sumandrita
 *
 */
public class stripLastCharOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();

		str = str.substring(0,9);
		System.out.println("The new string is : " + str);

	}
}