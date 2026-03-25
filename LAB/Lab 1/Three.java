//3.wap to find largest among 3 numbers
import java.util.*;
class LarThree
{
	int num1,num2,num3;
	Scanner sc = new Scanner (System.in);
	public void accept()
		{
		
		System.out.println("Enter 3 numers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		}
		public void cal()
		{
		if(num1>num2 && num1>num3)
		{
		System.out.println(num1+" is greater number");
		}
		else if(num2>num3)
		{
		System.out.println(num2+" is greater number");
		}
		else
		{
		System.out.println(num3+" is greater number");
		}
		}

}

public class Three
{
	public static void main(String args [])
	{
		LarThree obj = new LarThree();
		obj.accept();
		obj.cal();
	}
}