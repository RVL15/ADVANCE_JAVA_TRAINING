/* Reverse the accepted array*/
import java.util.*;
class ArrRev
	{
		public static void main(String args[])
		{
		int a[]=new int[7];
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 7 values: ");
		for( i=0;i<7;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Values stored in array are : ");
		for(i=0;i<7;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Reverse of Values stored in array are : ");
		for(i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}

