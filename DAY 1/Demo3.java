import java.util.Scanner;
class Demo3
{
	public static void main(String args[])
	{
		//variable declaration
		int a,b,sum;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter number 1 :");
		a=sc.nextInt();
		System.out.print("Enter number 2 :");
		b=sc.nextInt();
                sum=a+b;
		System.out.println("The Addition is :" + sum);	
	}
} 	