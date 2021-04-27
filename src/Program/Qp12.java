package Program;

import java.util.Scanner;

public class Qp12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("type ur no");
		int t = s.nextInt();
		int org = t;
		int sum = 0;
		int count = 0;
		while (org != 0) {
			int rem = (org % 10);
				count++;
			org = org / 10;

		}
		System.out.println(count);
	}

}
