package learning;
import java.util.Scanner;

public class reverseIntegerArray {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length of array:");
	int n=sc.nextInt();
	String a[] = new String[n];
	System.out.println("Enter array: ");
	for(int i=0;i<=n-1;i++)
	{
		a[i]= sc.next();
	}
	System.out.println("Reversed array: ");
	for(int j = n-1; j>=0; j--)
	{
		System.out.println(a[j]);
	}
		
	sc.close();
}
	
}
