//for(i=initialization;test condition;i++/i--)  write a program to accept a //program from user and display table of it.
import java.util.*;
class Table
{
	public static void main(String args[])
 {
	int i , n, ans;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	n = sc.nextInt();
	System.out.println("Table of "+n+" is:  ");
	for(i=1;i<=10;i++)
	{
	ans=n*i;
	System.out.println( ans);

	}
	
  }
}