import java.util.*;

public class hashcode {

	public static void main(String[] args) {
		Map<Integer, String> number = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integer want to add in map: ");
		int n = sc.nextInt();

		int key = 0;
		String value = "";
		for (int i = 0; i < n; i++) {
			System.out.println("Enter key : ");
			key = sc.nextInt();
			System.out.println("Enter the value : ");
			value = sc.next();
			number.put(key, value);

		}

		System.out.println(number);

	}

}
