import java.util.*;

public class maxMinAvrg {

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
		System.out.println("The List is: " + num);

		float sum = 0;
		float avg = 0;
		int i;
		for (i = 0; i < n; i++) {

			sum += num.get(i);

		}

		avg = sum / n;
		System.out.println("The average is: " + avg);
		System.out.println("The Maximum Value is: " + Collections.min(num));
		System.out.println("The Minimum Value is: " + Collections.max(num));

	}

}
