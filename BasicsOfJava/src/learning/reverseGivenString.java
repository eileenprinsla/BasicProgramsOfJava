package learning;
import java.util.*;

public class reverseGivenString {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String: ");
	String str = sc.next();
	char a[];
	a = str.toCharArray();
	
	for(int i = a.length-1 ;i>=0;i--)
	{
		System.out.print(String.valueOf(a[i]));
	}
	sc.close();
}
}
