/*
Write an interactive program to print a diamond shape.
For example, if user enters the number 3, the diamond will be as follows:
	*
   * *
  * * *
   * *
    *
*/
import java.util.Scanner;
public class Lab_4_7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=1;i<=n-1;i++)
		{
			for(int k=0;k<=i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}