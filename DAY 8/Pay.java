/* create interface payment with method pay. implement interface in upi payment and cash payment class*/
interface Payment
	{	
		void payment();
	}
class UpiPayment implements Payment
	{
		public void payment()
		{
			System.out.println("Online Payment");
		}
	}

class CashPayment implements Payment
	{
		public void payment()
		{
			System.out.println("Cash Payment");
		}
	}
public class Pay
	{
		public static void main(String args [])
		{
			UpiPayment up= new UpiPayment();
			up.payment();
			CashPayment cp= new CashPayment();
			cp.payment();
		}
	} 