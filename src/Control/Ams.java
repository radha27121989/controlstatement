package Control;

import java.util.Scanner;

public class Ams {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("type ur number ");
	
	int n = s.nextInt();
	int org = n;
	int ams = 0;
	while (org!=0) {
	int rem = (org%10);
	ams = ams + (rem*rem*rem);
	org = org/10;
	}
	if (ams == n) {
		System.out.println("amstrong no");
	}
	else {
		System.out.println("no amstrong no");
	}
	
	
}

}
