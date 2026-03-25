/*WAAP TO CREATE CLASS PERSON WITH MEMBERS (NAME,AGE,CITY ) AND CHECK AGE OF A PERSON WHETHER HE IS ADULT OR NOT.  */

/*WAP TO EXPLAIN CAR OBJECT*/
import java.util.*;

class Person
	{
	String name;
	String city;
	int age;
	Scanner sc = new Scanner(System.in);
	public void accept()
		{
			System.out.println("Enter name , city , age: ");
			name =sc.nextLine();
			city =sc.nextLine();
			age =sc.nextInt();
						
		}
		public void calculate()
		{
			if (age>= 18)
			System.out.println("Person age is  "+age+ ". So he/she is adult");
			else
			System.out.println("Person age is  "+age+ ". So he/she is not adult");
		}
	}
class PersonMain
{
	public static void main(String args[])
	{
		Person obj= new Person();
		obj.accept();
		obj.calculate();
	}
}
		