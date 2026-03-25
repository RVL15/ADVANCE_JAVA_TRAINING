/* Switch case is used for menu driven programing
Syntax
switch(ch)
{
	case1:
		block of code
		break;

	case2:
		block of code
		break;
...
	default:
		block of code
		break;
}
*/
import java.util.*;
class SwiCal
{
	public static void main(String args [])
	{
		double num1,num2,ans;
		int ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Select Choice from the given Menu");
		System.out.println("1. ADDITION \t 2. SUBSTRACTION \t 3. MULTIPLICATION \t 4. DIVISIon");
		
		System.out.println("Enter Your Choice:");
		ch=sc.nextInt();

		switch(ch)
			  {
				case 1:
				System.out.println("Enter First Number:");
				num1=sc.nextDouble();

				System.out.println("Enter Second Number:");
				num2=sc.nextDouble();
				ans = num1 + num2;	
				System.out.println(ans);

				break;

				case 2:
				System.out.println("Enter First Number:");
				num1=sc.nextDouble();

				System.out.println("Enter Second Number:");
				num2=sc.nextDouble();
				ans = num1 - num2;
				System.out.println(ans);

				break;

				case 3:
				System.out.println("Enter First Number:");
				num1=sc.nextDouble();

				System.out.println("Enter Second Number:");
				num2=sc.nextDouble();
				ans = num1 * num2;
				System.out.println(ans);
				break;

				case 4:
				System.out.println("Enter First Number:");
				num1=sc.nextDouble();

				System.out.println("Enter Second Number:");
				num2=sc.nextDouble();
				ans = num1 / num2;
				System.out.println(ans);
				break;
		
				default:
				System.out.println("Invalid Choice");
			}
			
	}
}



		