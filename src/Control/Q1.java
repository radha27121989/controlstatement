package Control;

public class Q1 {
	public static void main(String[] args) {
		String s = "attukutti";
		String  rev = "";
		for (int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i); 
			rev = rev+ch;
		
		}
		if (s.equals(rev)) {
			System.out.println("palidrome");
		}
		else {
			System.out.println("not");
		}
		
	
		
		
	}
	
	
}
