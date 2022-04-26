import java.util.*;
public class Lab_4_3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of arry element: ");
		int n=sc.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n ;i++ )
		{
			System.out.println("enter element : ");
			a[i]=sc.nextInt();
			System.out.println("your array is : "+a[i]);
		}
		System.out.println("============================");
		for (int j=n-1;j>=0 ;j-- )
		{
			System.out.println("your reverse array is : "+a[j]);
		}
	}
}