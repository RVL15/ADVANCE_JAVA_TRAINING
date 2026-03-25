/* WRITE A PROGRAM TO CREATE TRAFFIC SIGNAL INDICATOR WHICH SHOS YOU ABOUT SPEED OF THE VEHICLE BASED ON INPUT GIVEN USER*/
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
class Traffic
{
	public static void main(String args [])
	{
		double num1,num2,ans;
		int ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Select Traffic Signal");
		System.out.println("1. RED \t 2. YELLOW \t 3. GREEN ");
		
		System.out.println("Enter Your Choice:");
		ch=sc.nextInt();

		switch(ch)
			  {
				case 1:
				System.out.println("PLEASE STOP");				
				break;

				case 2:
				System.out.println("GO SLOW AND STOP");
				break;

				case 3:
				System.out.println("YOU CAN GO ");
				break;
		
				default:
				System.out.println("Invalid Choice");
			}
			
	}
}



		