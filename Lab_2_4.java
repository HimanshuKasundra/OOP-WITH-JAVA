import java.util.Scanner;
import java.lang.Math;
public class Lab_2_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Radius : ");
		double r = sc.nextDouble();
		double area = (Math.PI)*r*r;
		System.out.println("area of circle = "+area);
	}
}