package test2;

public class Threadtest {
	static Lefthand left;
		static Righthand right;
		public static void main(String[] args)
		{	left = new Lefthand();
			right = new Righthand();
			left.setPriority(Thread.MAX_PRIORITY);
			left.start();
			try {Thread.sleep(100);
}
			catch(Exception e) {}
			right.start();
		}
}
class Lefthand extends Thread
{	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{	System.out.println("You are Students!");
			try
			{	sleep(100);
			}catch(Exception e){}
		}
	
   }
}
class Righthand extends Thread
{	public void run()
	{	for(int i=0;i<=5;i++)
		{	System.out.println("I am a Teacher!");
			try
			{	sleep(100);
			}
			catch(Exception e){}
		}
	}


}

