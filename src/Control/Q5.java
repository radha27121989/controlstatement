package Control;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Q5 {
	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 2;
		a[1] = 10;
		a[2] = 8;
		/*int temp=0;
		
		for (int i = 0; i <a.length; i++) {
			for (int j = i+1; j <a.length; j++) {
			if(a[i]>a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j]= temp;
			}
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}*/
		//method of sort asce
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		
	}
	
}
