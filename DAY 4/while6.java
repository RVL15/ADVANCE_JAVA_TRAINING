//while (test condition)awap to check weather the number is armstrom number or //not
import java.util.*;
class while6
	{
		public static void main(String args[])
		{
		int i = 1,n,rem,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		n = sc.nextInt();
		temp=n;
		while(n>0)
			{
			rem = n%10;
			sum= (rem*rem*rem)+sum;
			n=n/10;
			i++;
			}
			if (sum==temp)
		        System.out.println("It is Aramstrom Number");
			else
			System.out.println("It is not Armstrom number ");
		}
	}
