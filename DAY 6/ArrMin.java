/* minimum of accepted array*/
import java.util.*;
class ArrMin
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
		int min = a[0];
		for(i=0;i<a.length-1;i++)
		{
			if(min > a[i])
			{
			min=a[i];
			}
		
		}
		System.out.println("");

		System.out.println("Minimum of the given Array is : " +min);
			
		}
	}


