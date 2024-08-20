package learning;
import java.util.Scanner;

public class swappingIntegersWithoutUsingTempVariable {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value 1: ");
		int a= sc.nextInt();
		System.out.println("Enter value 2: ");
		int b= sc.nextInt();	
		int x=a;
		int y=b;
		a = (x+y)-x;
		b = (x+y)-y;
		System.out.println("value 1: "+ a);
		System.out.println("value 2: "+ b);
		sc.close();
	
	}

}
