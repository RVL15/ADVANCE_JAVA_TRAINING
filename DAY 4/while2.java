//while (test condition)accept number from user and print its table using //while
import java.util.*;
class while2
	{
		public static void main(String args[])
		{
		int i = 1,n,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		n = sc.nextInt();
		System.out.println("Table of "+n+" is:  ");
		
		while(i<=10)
		{
		ans = n*i;
		System.out.println(n+" * "+  i +" = "+ ans);
		i++;
		}
		}
	}
