package Control;

public class Ascending {
public static void main(String[] args) {
	int a[] = new int[5];
	a[0]=10;
	a[1]=50;
	a[2]=30;
	a[3]=70;
    a[4]=3;
   int temp=0;
   
for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a.length; j++) {
	if(a[i]<a[j]) {   //if the greater than symbol is changed 
		//then it is descending order
		temp = a[i];
		a[i]= a[j];
		a[j]=temp;	
	}

	
}
}
for (int i = 0; i <5 ; i++) {
	System.out.println(a[i]);
}
}}
