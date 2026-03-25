//for(i=initialization;test condition;i++/i--)  write a program to get even numbers //between between 1 and n
import java.util.*;
class even
{
	public static void main(String args[])
 {
	long i  ,n;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	n=sc.nextLong();
	System.out.println("even numbers between  "+ n + " and 100 are:"  );
	for(i=n;i<=100;i++)
	{
 	if(i % 2 ==0)
	System.out.println(i + "\t"  );
	
	}
  }
}