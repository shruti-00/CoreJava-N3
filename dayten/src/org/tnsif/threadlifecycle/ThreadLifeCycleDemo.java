package org.tnsif.threadlifecycle;
//program to demonstrate on thread lifecycle
//driver class
public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		
		Tech t = new Tech();
		SoftSkills s = new SoftSkills();
		t.start();
		
		//move control to another thread
		t.yield();
		s.start();
	}

}

/*OUTPUT
Java Full Stack Training
1 Professional ethics
1 2 3 4 5 Soft skill session
2 3 4 5 Tech session :
*/
