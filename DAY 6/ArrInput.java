/*Accept values from user
*/
import java.util.*;
class ArrInput
{
	public static void main(String args [])
	{
		int a[]=new int[5];
		int i ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 values: ");
		for( i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Values stores in array are : ");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}