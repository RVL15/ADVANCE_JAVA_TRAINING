//4.check weather number is even or not
import java.util.*;
class EveOdd
	{
		int num;
		Scanner sc = new Scanner(System.in);
		public void accept()
		{
		
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		}
		
		public void cal()
		{
		
		if(num % 2 == 0)
		{
		System.out.println("Your number is Even");
		}
		else
		{
		System.out.println("Your number is Odd");
		}
		}
	}
	
public class EvenOdd
	{
		public static void main(String args [])
		{
			EveOdd obj = new EveOdd();
			obj.accept();
			obj.cal();
		}
	}
		



