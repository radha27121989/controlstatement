package Program;

import java.util.Scanner;

public class Qp13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("type ur no");
		int t = s.nextInt();
		int org = t;
		int sum = 0;
		
		while (org != 0) {
			int rem = (org % 10);
			sum = sum + rem;
			org = org / 10;
		}
		System.out.println(sum);
	}

}
