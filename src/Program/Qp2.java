package Program;

import java.util.Scanner;

public class Qp2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("type any number");
		int t = s.nextInt();

		if (t % 2 == 0) {
			System.out.println("given nunber is even");
		} else {
			System.out.println("given number is odd");
		}

	}

}
