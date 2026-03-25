/* maximum of accepted array*/
import java.util.*;
class ArrMax
	{
		public static void main(String args[])
		{
		int a[]=new int[5];
		int i ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 values: ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Values stored in array are : ");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int max = a[0];
		for(i=0;i<a.length-1;i++)
		{
			if(max < a[i])
			{
			max=a[i];
			}
		
		}
		System.out.println("");

		System.out.println("Maximum of the given Array is : " + max);
			
		}
	}


