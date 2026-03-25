/* Write a program to display total salary of a person.
   Accept basic salary from user. 
   pf 12% of basic salary
   10% HRA of basic salary
   12% DA of basic salary
   Calculate net salary
*/
import java.util.*;
class SalCal
{
	public static void main(String args [])
	{
		double bSalary,hra,da,pf,netSal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Basic Salary:");
		bSalary=sc.nextDouble();

		pf=bSalary*0.12;
		System.out.println("The pf calculates is: "+ pf);

		hra=bSalary*0.10;
		System.out.println("The hra calculates is: "+ hra);

		da=bSalary*0.12;
		System.out.println("The da calculates is: "+ da);

		netSal = (bSalary+hra+da)-pf;
		System.out.println(".........Your salary Slip......... ");
		System.out.println("");
		System.out.println("Your Basic salary: "+bSalary);
		System.out.println("Your HRA is : "+ hra);
		System.out.println("Your DA is : "+ da);
		System.out.println("Your PF is : "+ pf);
		System.out.println("Your NetSal is : "+ netSal);
	}
}




		
		