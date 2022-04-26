public class Lab_4_5
{
	public static void main(String[] args)
	{
		String a= args[0];
		int l=a.length();
		char b=args[0].charAt(0);
		boolean flag = true;
		for (int i=0;i<l ;i++ )
		{
			if (Character.isUpperCase(b))
			{
				
				flag = false;
			}
			
		}
		if (flag==false)
		{
			System.out.println("terminated.....");
		}
		else
			System.out.println(args[0]);
	}
}