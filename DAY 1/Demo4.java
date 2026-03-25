import java.util.Scanner;
class Demo4
{
	public static void main(String args[])
	{
		//variable declaration
		float a,b,sum;
		float avg;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter number 1 :");
		a=sc.nextFloat();
		System.out.print("Enter number 2 :");
		b=sc.nextFloat();
		avg = a+b/2;
		System.out.println("The Average is :" + avg);
	
	}
} 	