import java.util.*;
class circle
{
	public static void main(String args[])
	{
		float r , area;
 		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius :");
		r = sc.nextFloat();
		area = 3.14f * r * r;
                System.out.println(" Area is :" + area);
	}
}
