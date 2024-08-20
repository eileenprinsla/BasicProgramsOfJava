package learning;
import java.util.Scanner;


public class findEvenOrOdd {
	
	
	public static void main(String[] args )
	{
		System.out.println("Enter the number : ");
		Scanner n = new Scanner(System.in);
		int input  = n.nextInt();
		if(input % 2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
		n.close();
		
	}

}
