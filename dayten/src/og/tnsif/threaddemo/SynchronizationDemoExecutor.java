package og.tnsif.threaddemo;
//program to demonstrate on synchronization
//driver class
public class SynchronizationDemoExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizationDemo obj = new SynchronizationDemo();
		ThreadOne t1 = new ThreadOne(obj);
		ThreadTwo t2 = new ThreadTwo(obj);
		t1.start();
		t2.start();
		
	}

}
