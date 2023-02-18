package og.tnsif.usingrunnable;
//program to demonstrate on runnable interface for a thread 
public class Marathon implements Runnable{
	//private data members
	private int speed;
	private String city;
	
	//runnable interface contains run() method by default
	@Override
	public void run() {
		
		System.out.println("Speed of a participant : " + speed + "The city is :" + city);		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
