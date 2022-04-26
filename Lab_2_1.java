import java.util.Scanner;
public class Lab_2_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter no. :");
		int a = input.nextInt();
		System.out.print("enter another no. :");
		int b = input.nextInt();
		int sum = a+b;
		System.out.print("sum = "+sum);
	}
}