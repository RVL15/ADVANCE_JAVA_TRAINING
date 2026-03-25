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
wap TO CALCULATE AREA OF CIRCLE , RECTANGLE AND SQUARE 
*/
import java.util.*;
class SwiArea
{
	public static void main(String args [])
	{
		double Radius,num1,num2,ans;
		int ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Select Choice from the given Menu");
		System.out.println("1. AREA OF CIRCLE \t 2. AREA OF RECTANGLE \t 3. AREA OF TRIANGLE ");
		
		System.out.println("Enter Your Choice:");
		ch=sc.nextInt();

		switch(ch)
			  {
				case 1:
				System.out.println("Enter Radius of Circle:");
				Radius=sc.nextDouble();
				ans = 3.14*(Radius*Radius);	
				System.out.println(ans);

				break;

				case 2:
				System.out.println("Enter Length of Rectangle:");
				num1=sc.nextDouble();

				System.out.println("Enter Breadth of Rectangle:");
				num2=sc.nextDouble();
				ans = num1 * num2;
				System.out.println(ans);

				break;

				case 3:
				System.out.println("Enter Length of Square:");
				num1=sc.nextDouble();

				ans = num1 * num1;
				System.out.println(ans);
		
				default:
				System.out.println("Invalid Choice");
			}
			
	}
}



		