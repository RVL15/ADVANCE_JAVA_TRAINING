//while (test condition)accept number from user and print ireverse of the //number
import java.util.*;
class while3
	{
		public static void main(String args[])
		{
		int i = 1,n,rem,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		n = sc.nextInt();
		System.out.println("Revese of  "+n+" is:  ");
		
		while(n>0)
		{
		rem = n%10;
		rev= rev*10+rem;
		n=n/10;
		i++;
		}
		System.out.println(rev);
		}
	}
