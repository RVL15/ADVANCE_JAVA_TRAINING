import java.util.Scanner;
class  User{
        double basic, da, hra, gross, pf;
        Scanner sc = new Scanner(System.in);

        public void accept() {
			System.out.println("Enter Basic Salary");
			basic = sc.nextDouble();
		}

        public void calculate() {
            da = 0.10 * basic;
            hra = 0.15 * basic;
            pf = 0.06 * basic;
            gross = basic + da + hra - pf;
            System.out.println("Gross Salary is: " + gross);
        }
}
public class Salary
{
	public static void main(String args[])
	{
	User obj= new User();
	obj.accept();
	obj.calculate();
	}
}