//2.wap to check weather person is eligible for voting or not
import java.util.*;
class Vot
	{
		int age;
		Scanner sc = new Scanner(System.in);
		public void accept()
		{
		
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		}
		
		public void cal()
		{
		if(age>=18)
		{
		System.out.println("Your age is : "+age+". You are Eligible for Voting");
		}
		else
		{
		System.out.println("Your age is : "+age+". You are not Eligible for Voting");
		}
		}
	}
	
public class Voting
	{
		public static void main(String args [])
		{
			Vot obj= new Vot();
			obj.accept();
			obj.cal();
		}
	}
		



