/* implement multilevel inheritance take 3 classes = rectangle=to accept data , compute= to perform calculation , result= to pront out put of area of rectangle. */
import java.util.*;

class Rectangle
	{
		double l,b,area;
		Scanner sc = new Scanner(System.in);
		public void accept()
		{
		System.out.println("Enter Length and Breadth");
		l=sc.nextDouble();
		b=sc.nextDouble();
		}
	}
class Compute extends Rectangle
	{
		public void cal()
		{
		area=l*b;
		}
	}
class Result extends Compute	
	{
		public void result()
		{
		System.out.println("Area of Retangle is : "+ area);
		}
	}
public class Multilevel
	{
		public static void main(String args [])
		{
			Result obj = new Result();
			obj.accept();
			obj.cal();
			obj.result();
			
		}
	}