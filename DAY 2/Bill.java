//tarif
import java.util.*;
class Bill
{
	public static void main(String args[])
	{
		double bill,uc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Unit comsumed ");
		uc=sc.nextInt();
		if(uc >= 300)
		{
			System.out.println(" Unit Consumed : "+ uc);
			bill = 100*1.5 + 100*2.5 + 100*4 +(uc-300)*6;
			System.out.println(" Bill Amount :" + bill);
			
		}
		else if(uc >= 200)
		{
			System.out.println(" Unit Consumed : " + uc);
			bill = 100*1.5 + 100*2.5+ (uc-200)*4;
			System.out.println(" Bill Amount :" + bill);
		} 
		else if(uc >= 100)
		{
			System.out.println(" Unit Consumed : " + uc);
			bill = 100*1.5 +  (uc-100)*2.5;
			System.out.println(" Bill Amount :" + bill);

		}

		else
		{
			System.out.println(" Unit Consumed : " + uc);
			bill = 100 * 1.5;
			System.out.println(" Bill Amount :" + bill);
		}
	}
}
		