package capgeminitrainingjava;

class Test extends Thread
{
	@Override
	public void run()
	{
		try {
			for(int i =0;i<10;i++)
			{
			Thread.sleep(500);
			System.out.println("In custom thread");
			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class Sample32 extends Thread
{
	
	@Override
	public void run()
	{
		try {
			while(true)
			{
				Thread.sleep(500);
				System.out.println("In demon thread");
			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

public class Deamon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		Sample32 s = new Sample32();
		s.setDaemon(true);
		t.start();
		s.start();
/*
 * output
In custom thread
In demon thread
In demon thread
In custom thread
In custom thread
In demon thread
In custom thread
 * 
 * 
 */
	}

}
