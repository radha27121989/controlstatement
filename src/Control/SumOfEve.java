package Control;

public class SumOfEve {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				count++;
			
			}

		}
		System.out.println(sum);
	}
}