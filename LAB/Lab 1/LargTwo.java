/*1.WAP to find largest among two numbers  
2.wap to check weather person is eligible for voting or not 
3.wap to find largest among 3 numbers
4.check weather number is even or not */
import java.util.*;
class LarTwoNum
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		public void accept()
		{
		
		System.out.println("Enter 2 numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		}
		
		public void cal()
		{
		if(num1>num2)
		{
		System.out.println(num1+" is greater number");
		}
		else
		{
		System.out.println(num2+" is greater number");
		}
		}
	}
	
public class LargTwo
	{
		public static void main(String args [])
		{
			LarTwoNum obj= new LarTwoNum();
			obj.accept();
			obj.cal();
		}
	}
		



