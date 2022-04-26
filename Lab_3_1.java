import java.util.Scanner;
public class Lab_3_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------marksheet-----");
		System.out.println("enter marks of maths(out of 100) : ");
		int m = sc.nextInt();
		System.out.println("enter marks of science(out of 100) : ");
		int s = sc.nextInt();
		System.out.println("enter marks of english(out of 100) : ");
		int e = sc.nextInt();
		System.out.println("enter marks of gujrati(out of 100) : ");
		int g = sc.nextInt();
		System.out.println("enter marks of computer(out of 100) : ");
		int c = sc.nextInt();
		double total = m+s+e+g+c;
		double percentage = total/5;
		System.out.println("Percentage : "+percentage+"%");
		if(percentage>=60 && percentage<=100)
		{
			System.out.println("Class is First class division");
		}
		else if (percentage>=50 && percentage<60)
		{
			System.out.println("Class is Second class division");
		}
		else if (percentage>=40 && percentage<50)
		{
			System.out.println("Class is Third class division");
		}
		else
		{System.out.println("FAIL......!!!!!");}
	}
}