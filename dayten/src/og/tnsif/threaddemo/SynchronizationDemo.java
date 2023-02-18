package og.tnsif.threaddemo;
//program to demonstrate on synchronization

public class SynchronizationDemo {
	synchronized void print(int num) //throws InterruptedException
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println(num*i);
		}
	}

}
class ThreadOne extends Thread
{
	SynchronizationDemo d;

	public ThreadOne(SynchronizationDemo d) {
		super();
		this.d = d;
	}
	
	public void run()
	{
		d.print(10);
		/*try {
			d.print(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}

class ThreadTwo extends Thread
{
	SynchronizationDemo d;

	public ThreadTwo(SynchronizationDemo d) {
		super();
		this.d = d;
	}

	public void run()
	{
		d.print(5);

		/*try {
			d.print(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
