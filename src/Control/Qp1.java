package Control;

import java.util.Scanner;

public class Qp1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("type ur age");
		int age = s.nextInt();
		if (age <= 18) {
			System.out.println("not eligible");
		} else {
			System.out.println("ur eligible");
		}

	}

}
