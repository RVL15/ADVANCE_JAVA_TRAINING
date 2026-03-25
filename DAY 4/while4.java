//while (test condition)accept number from user and check weather the number //is palindrome or not.
import java.util.*;
class while4
	{
		public static void main(String args[])
		{
		int i = 1,n,rem,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		n = sc.nextInt();
		System.out.println("Revese of  "+n+" is:  ");
		temp = n;
		while(n>0)
			{
			rem = n%10;
			sum= (sum*10)+rem;
			n=n/10;
			i++;
			}
			if(sum==temp)
			System.out.println("It is palindrome ");
			else
			System.out.println("It is not palindrome  ");
		}
	}
