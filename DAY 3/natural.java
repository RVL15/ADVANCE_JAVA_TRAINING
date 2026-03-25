//for(i=initialization;test condition;i++/i--)  write a program to accept sum //of first 10 natural numbers
import java.util.*;
class natural
{
	public static void main(String args[])
 {
	int i ,  sum=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	
	System.out.println("sum of first 10 natural numbers :"  );
	for(i=1;i<=10;i++)
	{
	sum=i+sum;
	

	}
	System.out.println( +sum);

  }
}