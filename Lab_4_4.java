import java.util.Scanner;
public class Lab_4_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String(without space) : ");
		String input = sc.next();
		int s = input.length();
		System.out.println("===================");
		System.out.println("length of String: "+s);
		System.out.print("Half String is : ");
		for (int i=s/2;i<s ;i++ )
		{
			char ch = input.charAt(i);
			System.out.print(ch);
		}
	}
}