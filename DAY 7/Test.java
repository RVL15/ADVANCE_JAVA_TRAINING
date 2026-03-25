import java.util.*;

class MobilePhone
	{
	String brand;
	int battery;
	void makeCall()
	{
	System.out.println("Make a call");
	}

	void showDetails()
	{
	System.out.println("Brand: "+brand);
	System.out.println("Battery: "+battery+" %");
	}

	}

class SmartPhone extends MobilePhone
{
	void takePhoto()
	{
	System.out.println("Take Photo using Camera!");
	}

	void useInternet()
	{
	System.out.println("Browsing Internet");
	}
}

public class Test
{
	public static void main(String args[])
	{
		SmartPhone sp = new SmartPhone();
		sp.brand="Apple";
		sp.battery= 100;
		
		sp.makeCall();
		sp.showDetails();
		sp.takePhoto();
		sp.useInternet();
	}
}

