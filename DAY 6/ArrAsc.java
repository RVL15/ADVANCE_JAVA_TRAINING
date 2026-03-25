/* maximum of accepted array*/
import java.util.*;
class ArrAsc
	{
		public static void main(String args[])
		{
		int a[]=new int[5];
		int i , j, temp ;
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

		for(i=0;i<a.length-1;i++)
		{
			for (j=i+1;j<a.length;j++)
				{
			if(a[i] > a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		
		        	}
		}
		System.out.println("");

		System.out.println("\nAscending order of Array is : ");
		
		for (i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			
		}
	}


