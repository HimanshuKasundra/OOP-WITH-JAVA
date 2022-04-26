import java.util.Scanner;
class Bank_Account
{
	int accountNo;
	String userName;
	String email;
	String accountType;
	double accountBalance;

	void getAccountDetails(int n,String u,String e,String at,double bal)
	{	
		accountNo=n;
		userName=u;
		email=e;
		accountType=at;
		accountBalance=bal;
	}

	void displayAccountDetails()
	{
		System.out.println("account no :"+accountNo);
		System.out.println("userName :"+userName);
		System.out.println("email :"+email);
		System.out.println("accountType :"+accountType);
		System.out.println("accountBalance :"+accountBalance);
	}
}
class Lab_5_4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("account no :");
		int n=input.nextInt();
		System.out.println("userName :");
		String u=input.next();
		System.out.println("email :");
		String e=input.next();
		System.out.println("accountType :");
		String at=input.next();
		System.out.println("accountBalance :");
		double bal=input.nextDouble();
		Bank_Account b1 = new Bank_Account();
		b1.getAccountDetails(n,u,e,at,bal);
		System.out.println("-------------------------------");
		b1.displayAccountDetails();
	}
}