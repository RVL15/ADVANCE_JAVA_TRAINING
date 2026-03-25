//wap to accept percentage and make decision whether student is fail , second class, first class //or distinction.
import java.util.*;
class Comparison3
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Percentage of student: ");
		a=sc.nextInt();
		if(a>=90)
		{
			System.out.println(" Student passed by distinction ");
		}
		else if(a>=75)
		{
			System.out.println(" Student passed by first class");
		}
		else if(a>=45)
		{
			System.out.println(" Student passed by second class");
		}

		else
		{
			System.out.println(" Student Failed");
		}
	}
}
		