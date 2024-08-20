package learning;
import java.util.*;
public class basicCalculatorOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Addition");
			System.out.println("2.Multiplication");
			System.out.println("3.Subtraction");
			System.out.println("4.Division");
			System.out.println("Enter which operation you want to perform: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Addition");
				System.out.println("Enter value1: ");
				int num1=sc.nextInt();
				System.out.println("Enter value2: ");
				int num2=sc.nextInt();
				System.out.println("Result of Addition: "+(num1+num2));
				break;
			case 2:
				System.out.println("Multiplication");
				System.out.println("Enter value1: ");
				int num3=sc.nextInt();
				System.out.println("Enter value2: ");
				int num4=sc.nextInt();
				System.out.println("Result of Multiplication: "+(num3*num4));
				break;
			case 3:
				System.out.println("Subtraction");
				System.out.println("Enter value1: ");
				int num5=sc.nextInt();
				System.out.println("Enter value2: ");
				int num6=sc.nextInt();
				System.out.println("Result of Subtraction: "+(num5-num6));
				break;
			case 4:
				System.out.println("Division");
				System.out.println("Enter value1: ");
				int num7=sc.nextInt();
				System.out.println("Enter value2: ");
				int num8=sc.nextInt();
				System.out.println("Result of Division: "+(num7/num8));
				break;
			}
			
		}
}
}
