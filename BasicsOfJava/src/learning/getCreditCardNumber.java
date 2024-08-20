package learning;
import java.util.Scanner;

public class getCreditCardNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		String a[] = new String[16];
		char c[] = new char[16];
		System.out.println("Enter your credit card number: ");
		String num=sc.next();
		if(num.length() < 10)
		{
			System.out.println("Entered credit card number is invalid ");
		}
		else if(num.length() >16)
		{
			System.out.println("Entered credit card number is invalid ");
		}
		else {
			c=num.toCharArray();
			for(int i=10;i<16;i++)
			{
				c[i]='X';
			}
			System.out.println("Your credit card number:");
			for(int i=0;i<16;i++)
			{
				System.out.print(c[i]);
			}
		}
		sc.close();
	}

}
