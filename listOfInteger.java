import java.util.*;

public class listOfInteger {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		int n, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list size :");
		n = sc.nextInt();

		for (int j = 0; j < n; j++) {
			System.out.println("Enter the number :");
			k = sc.nextInt();
			num.add(j, k);

		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + num.get(i);
		}
		System.out.println("The sum is: " + sum);

	}

}
