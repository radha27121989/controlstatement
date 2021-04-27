package Program;

import java.util.Scanner;

public class Qp11 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("type ur no");
	int t = s.nextInt();
	int org = t;
	while (org!=0) {
	int rev = (org%10);
	System.out.print(rev);
	org= org/10;
	
}
	

}
}
