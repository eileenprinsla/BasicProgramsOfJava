package learning;
import java.util.Scanner;
public class findMedian {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the element: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			if(min != i) {
			int temp = a[min];
			a[min]=a[i];
			a[i]=temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		int m = n/2;
		if(m%2==0)
		{
			System.out.println("Median: "+ ((a[m]+a[m+1])/2));
		}
		else
		{
			System.out.println("Median: "+ (a[m]));
		}
		sc.close();
	}

}
