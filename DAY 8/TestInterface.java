interface Camera
	{
		void takePhoto();
	}
interface MusicPlayer
	{
		void playMusic();
	}

class SmartPhone implements Camera,MusicPlayer
	{
		public  void takePhoto()
		{
			System.out.println("");
	
			System.out.println("Photos captures through smartphone");
		}
	
		public void playMusic()
		{
			System.out.println("");
			System.out.println("Music is playing on smartphone");
		}
	}

public class TestInterface
	{
		public static void main(String args [])
		{
			SmartPhone sp = new SmartPhone();
			sp.takePhoto();
			sp.playMusic();
		}
	}







	