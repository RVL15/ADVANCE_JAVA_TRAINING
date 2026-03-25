import java.util.Scanner;
class Rectangle
	{
		int len,width,area;
		Scanner sc=new Scanner(System.in);

		public void accept()
		{
			System.out.println("Enter Length and Breadth of the rectangle");
			len=sc.nextInt();
			width=sc.nextInt();
		}
		public void calculate()
		{
			area=len*width;
			System.out.println("Area of Rectangle is: "+area);
			
		}
	}
public class RectMain
{
	public static void main(String args[])
	{
	Rectangle obj= new Rectangle();
	obj.accept();
	obj.calculate();
	}
}