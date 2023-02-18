package og.tnsif.threaddemo;
//program to demonstrate on java synchronized in multithreading
//driver class
public class Receiver {

	public static void main(String[] args) {
		Sender send = new Sender();
		SendUsingThreads sender1 = new SendUsingThreads("Hello",send);
		SendUsingThreads sender2 = new SendUsingThreads("Welcome to corejava tutorials",send);
		
		//start two threads of SendUsingThreads
		sender1.start();
		sender2.start();
		
		//wait for thread to end
		try {
			sender1.join();
			sender2.join();
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
	}
}
