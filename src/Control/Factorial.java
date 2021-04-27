package Control;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("type factorial num");
		int r = s.nextInt();
		int fact = 1;
		
		for (int i = 1; i <= r; i++) {
			fact = fact * i;
		
			
	

		}
		System.out.println(fact);
	}

}
