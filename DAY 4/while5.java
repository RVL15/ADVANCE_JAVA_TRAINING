//while (test condition)accept numbers from user and get sum of digits of //user accepted number 
import java.util.*;
class while5
	{
		public static void main(String args[])
		{
		int i = 1,n,rem,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		n = sc.nextInt();
		System.out.println("Sum of given  "+n+" is:  ");
		while(n>0)
			{
			rem = n%10;
			sum= rem+sum;
			n=n/10;
			i++;
			}
		System.out.println(sum);
		}
	}
