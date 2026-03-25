/* String input
*/
import java.util.*;
class String2
{
	public static void main(String args [])
	{
		String name;
		char inputData;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		name=sc.nextLine();
		inputData=name.charAt(0);
		System.out.println("Your Name is : " + name);
		System.out.println("Your Name First Char is : " + inputData);
	}
}