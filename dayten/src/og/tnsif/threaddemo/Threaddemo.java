package og.tnsif.threaddemo;
import java.lang.Thread;
public class Threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("Current Thread :"+t);
		try {
			Thread.sleep(1);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread Interrupted :");
		}

	}

}
/*OUTPUT
 Current Thread :Thread[main,5,main]
 */ 
 