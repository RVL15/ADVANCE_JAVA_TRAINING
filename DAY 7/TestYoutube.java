import java.util.*;

class Youtube
{
	void WatchMovie()
	{
		System.out.println("You can watch movie YOUTUBE....");
	}
	
	void WatchShort()
	{
		System.out.println("You can watch short videos YOUTUBE....");
	}
}
class Premium extends Youtube
{
	void DowonloadMovie()
	{
		System.out.println("You can Dowonload movies on YOUTUBE....");
	}

	void ShareMovie()
	{
		System.out.println("You can Share movies on YOUTUBE....");
	}
}

public class TestYoutube
{
	public static void main (String args [])
	{
		Premium obj = new Premium();
		System.out.println();
		System.out.println(".................YOUTUBE.................");
		System.out.println();
		obj.WatchMovie();
		System.out.println();
		obj.WatchShort();
		System.out.println();
		obj.DowonloadMovie();
		System.out.println();
		obj.ShareMovie();
	}
}


