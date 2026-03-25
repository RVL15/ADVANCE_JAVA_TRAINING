/* WAP THAT TAKES INPUT FROM USER AND DOES ALL ARITHMETIC OPERATIONS POSSIBLE.*/
import java.util.*;
class Ari
{
	public static void main(String args [])
	{
		double a,b,add,div,mul,sub;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		a=sc.nextDouble();

		System.out.println("Enter Second Number:");
		b=sc.nextDouble();
		
		add = a + b ;
		System.out.println("Addtion is "+ add);

		sub = a - b ;
		System.out.println("Subtraction is "+ sub);
		
		mul = a * b ;
		System.out.println("Multiplication  is "+ mul);

		div = a / b ;
		System.out.println("Division is "+ div);

	}
}




		
		