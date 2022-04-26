class CountDemo
{
	static int count=0;
	CountDemo()
	{
		count++;
		System.out.println("no.of object created :"+count);
	}
}
class Lab_5_6
{
	public static void main(String[] args)
	{
		int count=2;
		CountDemo cd = new CountDemo();
		CountDemo cd1 = new CountDemo();
		CountDemo cd2 = new CountDemo();
	}
}