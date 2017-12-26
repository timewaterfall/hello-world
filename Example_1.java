package Example_1;

import java.util.Scanner;

public class Example_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("введіть число");

		int n = sc.nextInt();

		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= n; k++)
				{if (k % 2 == 0)
					System.out.print("***");
				else
					System.out.print("+++");
		}
			System.out.println();
		}

		

	}

}
