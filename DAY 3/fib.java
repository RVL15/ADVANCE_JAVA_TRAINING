//for(i=initialization;test condition;i++/i--)  write a program to get //factorial of number
import java.util.*;
class fib
{
	public static void main(String args[])
 {
	long i , sum,a=0,b=1,n;
	Scanner sc =new Scanner(System.in);
	System.out.println(a+"\t");
	System.out.println(b+"\t");
	System.out.println("Enter a number ");
	n=sc.nextLong();
	System.out.println("fibonaci series of number is:"  );
	for(i=1;i<=n;i++)
	//for(i=n;i>=1;i--)
	{
	sum=a+b;
	System.out.print(sum+ "\t"  );
	a=b;
	b=sum;
	}
  }
}