import java.util.*;
class Comparison2
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		a=sc.nextInt();
		if(a==0)
		{
			System.out.println(a+" is ZERO ");
		}
		else if(a>0)
		{
			System.out.println(a+" is Positive");
		}
		else
		{
			System.out.println(a+" is Negative");
		}
	}
}
		