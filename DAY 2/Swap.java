import java.util.*;
class Swap
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swap " + a + " "+ b);
		c=a;
		a=b;
		b=c;
                System.out.println("After swap: " );
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}


		
		