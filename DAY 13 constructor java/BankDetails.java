/*
Function Declaration
Function Definition
Function Calling
WHEN A BANK ACOUNT IS CREATED IT MUST HAVE:
It must have  account number,account holder name,balance
create constructor to initialize these details , while object is created?
*/

class Bank
{
	double AccountNo;
	String AccountHolderName;
	double AccountBalance;
	
	Bank(long No,String Name,long Balance)
	{
		AccountNo = No;
		AccountHolderName = Name;
		AccountBalance = Balance;
		
	}
	
	void display()
	{
		System.out.println("Bank Account No:" + AccountNo);
		System.out.println("Bank Holder Name :" + AccountHolderName);
		System.out.println("Bank  Acount Balance:" + AccountBalance);
	}
}
public class BankDetails
{
	public static void main (String args []){

	Bank b1= new Bank(1234567891,"Rishabh",36897232);
	Bank b2= new Bank(4567891,"Priya",368972232);
	b1.display();
	System.out.println("" );

	b2.display();

	}
}

