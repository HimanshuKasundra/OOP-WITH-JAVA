import java.util.*;
public class Lab_4_2
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of arry element: ");
		int n=sc.nextInt();
		double sum=0;
		int a[] = new int[n];
		for (int i=0;i<n ; i++)
		{
			System.out.println("enter element : ");
			a[i] = sc.nextInt();
			sum = sum+a[i];
		}
		double avg = sum/n;
		System.out.println("total  : "+sum);
		System.out.println("average is  : "+avg);
	}
}