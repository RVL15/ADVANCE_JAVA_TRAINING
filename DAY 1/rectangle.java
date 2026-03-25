import java.util.*;
class rectangle
{
	public static void main(String args[])
	{
		int l,b,perimeter;
		System.out.println("Enter length of Rectangle :");
		Scanner sc= new Scanner (System.in);
		
		l=sc.nextInt();

		System.out.println("Enter breadth of Rectangle :");

		b=sc.nextInt();
		perimeter = 2 * l * b;

		System.out.println(perimeter);
	}
}

                  