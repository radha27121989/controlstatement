package Control;

public class Reverse {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 5 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
