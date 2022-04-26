import java.util.Scanner;
public class Lab_3_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. to find Palindrome or not: ");
		int a = sc.nextInt();
		int sum = 0;
		int temp = a;
		while (a>0)
		{
			int b=a%10;
			sum = sum*10+b;
			a=a/10;
		}
		//System.out.println(sum);
		if (sum==temp)
		{
			System.out.println("given no. is Palindrome.");
		}
		else
			System.out.println("no. is not Palindrome...");
	}
}