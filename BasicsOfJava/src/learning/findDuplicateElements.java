package learning;
import java.util.*;
public class findDuplicateElements {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array: ");
		for(int i =0 ;i<n;i++) {
			a[i]=sc.nextInt();
		}
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> dup = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) {
			
				if(a[i] == a[j] )
					{
						dup.add(a[i]);
					}
				
		}
		sc.close();
		
	}
		System.out.println(dup);

}
}
