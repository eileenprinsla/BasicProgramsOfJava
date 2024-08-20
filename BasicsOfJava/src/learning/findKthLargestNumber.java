package learning;
import java.util.Scanner;
public class findKthLargestNumber {
	
	public static void main(String[] args) {
		int arr[] = {7,6,3,9,10,5};
		int n=6;
		for(int i=0;i<n;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[min_idx]>arr[j]) {
					min_idx=j;
				}
			}
			int temp=arr[min_idx];
			arr[min_idx]= arr[i];
			arr[i]=temp;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter k value:");
		int k = sc.nextInt();
		System.out.println("Kth Largest: "+arr[n-k]);
		sc.close();
	}
	
}
