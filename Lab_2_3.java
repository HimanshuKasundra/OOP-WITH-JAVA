import java.util.Scanner;
public class Lab_2_3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("---------CALCULATOR---------");
		System.out.println("enter no. : ");
		double a = input.nextDouble();
		System.out.println("enter another no.: ");
		double b = input.nextDouble();
		System.out.println("no.of oprations"+"\n"+"1.addition(+)"+"\n"+"2.subtraction(-)"+"\n"+"3.multiplication(*)"+"\n"+"4.division(/)");
		System.out.println("select any one of the above Symbol : ");
		String in = input.next();
		if(in.equals("+"))
		{
			System.out.println("ans = "+(a+b));
		}
		else if(in.equals("-"))
		{
			System.out.println("ans = "+(a-b));
		}
		else if(in.equals("*"))
		{
			System.out.println("ans = "+(a*b));
		}
		else if(in.equals("/"))
		{
			System.out.println("ans = "+(a/b));
		}
		else 
		{
			System.out.println("INvalid input....!!!!");
		}
	}
}	