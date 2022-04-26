import java.util.*;
public class Lab_4_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int l =s1.length();
		int vowel=0,consonent=0;
		String s2 = s1.toLowerCase();
		for (int i=0;i<l ;i++ )
		{
			if (s2.charAt(i)=='a' || s2.charAt(i)=='e' || s2.charAt(i)=='i' || s2.charAt(i)=='o' || s2.charAt(i)=='u')
			{
				vowel++;
			}
			else 
				consonent++;
		}
		System.out.println("vowels are "+vowel);
		System.out.println("consonents are "+consonent);
	}
}