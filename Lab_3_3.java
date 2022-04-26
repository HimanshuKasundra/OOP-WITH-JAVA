import java.util.Scanner;
public class Lab_3_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st no.: ");
		int a = sc.nextInt(); 
		System.out.println("enter 2nd no.: ");
		int b = sc.nextInt();
		System.out.println("enter 3rd no.: ");
		int c = sc.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println(a+" is largest ");
			else
				System.out.println(b+" is largest ");
		}
		else if(b>c)
		{
			if(b>a)
				System.out.println(b+" is largest ");
			else
				System.out.println(c+" is largest ");
		}
		else if (a==b && b==c)
			System.out.println("ALL ARE EQUAL");
		else 
		System.out.println(c+" is largest ");	
	}
}