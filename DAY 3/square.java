//for(i=initialization;test condition;i++/i--)  write a program to get square //between between n and 60
import java.util.*;
class square
{
	public static void main(String args[])
 {
	long i , square,n;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	n=sc.nextLong();
	System.out.println("sqare of numbers between "+ n + " and 60 are:"  );
	for(i=n;i<=60;i++)
	//for(i=n;i>=1;i--)
	{
	square=i*i;
	System.out.print(square+ "\t"  );
	
	}
  }
}