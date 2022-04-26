import java.util.Scanner;
public class Lab_2_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temprature in Fahrenheit :");
		double f = sc.nextDouble();
		double ans = (f-32)*(5.0/9);
		System.out.println("ans = "+ans);
	}
}