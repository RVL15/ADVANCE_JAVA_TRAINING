import java.util.*;
class Comparison
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else
		{
			System.out.println(b+" is greater than "+a);
		}
	}
}
		