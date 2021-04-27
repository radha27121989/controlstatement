package Program;

import java.util.Scanner;

public class Qp14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("type any number");
		int r = s.nextInt();
		int org = r;
		int rev = 0;
		while (org != 0);
			
		{
			int rem = (org % 10);
			rev = rev * 10 + rem;
			org = (org / 10);
		}
		if (rev == r) {
			System.out.println("polidrome");
		} else {
			System.out.println("no polidrome");
		}
	}

	

}
