package og.tnsif.threaddemo;
//program to demonstrate on thread class 
//driver class
public class ThreadExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleThreadProgram p = new SimpleThreadProgram();
		p.setName("Java Thread");
		p.setPriority(8);
		//when thread calls to start method it will come to run method 
		//(thread method automatically calls run method)
		p.start();
		//once we call start() method again we can't restart but we can call the run method  
		//p.start();
		System.out.println("Current Thread \n"+p);
	}

}

/*OUTPUT
Current Thread 
Thread[Java Thread,8,main]
Thread is in running state....
*/