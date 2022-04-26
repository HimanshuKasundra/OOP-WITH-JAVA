import java.util.Scanner;
public class Lab_3_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. : ");
		int p = sc.nextInt();
		int a = 0;
		int c ;
		for (int i=2;i<p/2 ;i++ )
		{
			
			if (p%i==0)
			{
				a=1;
				break;
			}
		}
		if (a==0){
		System.out.println("no.is prime..."+p);	
		}
		else
			System.out.println("no is not prime....!!!");
		
	}
}