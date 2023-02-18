package og.tnsif.usingrunnable;
//program to demonstrate on runnable interface for a thread 
//driver class
public class MarathonExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marathon m = new Marathon();
		m.setSpeed(40);
		m.setCity("Nashik");
		m.run();
	}

}
/*OUTPUT
Speed of a participant : 40The city is :Nashik
*/