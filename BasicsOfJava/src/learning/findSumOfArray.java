package learning;
import java.util.Scanner;

public class findSumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Sum of given array: ");
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=a[i];
		}
		System.out.println(total);
		sc.close();
	}
}
