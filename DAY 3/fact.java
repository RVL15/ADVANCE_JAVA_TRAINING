//for(i=initialization;test condition;i++/i--)  write a program to get //factorial of number
import java.util.*;
class fact
{
	public static void main(String args[])
 {
	long i ,  factorial=1,n;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	n=sc.nextLong();
	System.out.println("factorial of  number :"  );
	for(i=1;i<=n;i++)
	//for(i=n;i>=1;i--)
	{
	factorial=i*factorial;
	}
	System.out.println( factorial);


  }
}