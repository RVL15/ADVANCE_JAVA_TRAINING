import java.util.Scanner;
class Avg
	{
		float n1,n2,n3,avg;
		Scanner sc=new Scanner(System.in);

		public void accept()
		{
			System.out.println("Enter 3 numbers");
			n1=sc.nextInt();
			n2=sc.nextInt();
			n3=sc.nextInt();
		}
		public void calculate()
		{
			avg=(n1+n2+n3)/3;
			System.out.println("Average of 3 numbers is : "+avg);
			
		}
	}
public class AvgMain
{
	public static void main(String args[])
	{
	Avg obj= new Avg();
	obj.accept();
	obj.calculate();
	}
}