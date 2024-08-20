package learning;
import java.util.Scanner;

public class findMinElement {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter element of array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Min value: ");
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
		sc.close();
	}

}
