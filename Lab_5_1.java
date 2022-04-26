import java.util.Scanner;
public class Lab_5_1
{

	float circlearea(int r)
	{
		float ans = (float)3.14*r*r;
		return ans;
	}	
	public static void main(String[] args)
	{
		Area Obj1 = new Area();

		Scanner input = new Scanner(System.in);
		System.out.println("enter radius : ");
		int r=input.nextInt();
		float area =Obj1.circlearea(r);
		System.out.println("area of circle : "+area);
	}
}  