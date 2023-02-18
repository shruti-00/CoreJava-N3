package og.tnsif.threaddemo;
//program to demonstrate on java synchronized in multithreading
public class Sender {
	public void sendMessage(String message)
	{
		System.out.println("\n Sending "+message);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted");
		}
		System.out.println("\n "+message+"sent");
	}
}

//Class for sending a message using threads 
class SendUsingThreads extends Thread
{
	 private String message;
	 Sender send;
	 
	 //receives a message object and a string message to be sent
	 SendUsingThreads(String msg, Sender object)
	 {
		 message = msg;
		 send = object;
	 }
	 public void run()
	 {
		 //this will ensure that only one thread sends a message at a time
		 synchronized(send)
		 {
			 //synchronizing the send object
			 send.sendMessage(message);
		 }
	 }
}
