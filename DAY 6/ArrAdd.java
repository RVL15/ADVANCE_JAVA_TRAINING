/*Accept values from user
*/
import java.util.*;
class ArrAdd
{
	public static void main(String args [])
	{
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		int i ;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 5 values in Array a: ");
		for( i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter 5 values in Array b: ");
		for( i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}

		System.out.println("Values stores in array are a : ");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}

		System.out.println("Values stores in array are b : ");
		for(i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}
		
		for(i=0;i<5;i++)
		{
		c[i]=a[i]+b[i];
		}

		System.out.println("Addition of Array a and b in c is : ");
		for(i=0;i<5;i++)
		{
			System.out.println(c[i]);
		}

		

	}
}