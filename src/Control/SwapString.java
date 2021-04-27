
package Control;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("type any name");
		String t = s.nextLine();
	String	rev = " ";
	for (int i = t.length()-1; i>=0; i--) {
		char y = t.charAt(i);
		rev = rev+y;
	
	
		
	}
		
	System.out.println(rev);
		}
		

}

