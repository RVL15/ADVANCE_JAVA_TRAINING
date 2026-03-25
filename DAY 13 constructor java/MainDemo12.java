/* Example 1: 
 
When a customer books a car, the system should :
store car name
store price and customer name 

Function Declaration
Function Definition
Function Calling

*/

class Car
{
	String carName;
	int price;
	String customerName;

	Car(String cname,int p, String custName)
	{
	carName=cname;
	price=p;
	customerName=custName;
	}

	void display()
	{
		System.out.println("Car:"+carName);
		System.out.println("Car Price:"+price);
		System.out.println("Customer Name:"+customerName);
	}
}

public class MainDemo12
{
	public static void main (String args []){

	Car c1= new Car("BMW",89828,"Rishabh");
	c1.display();

	}
}