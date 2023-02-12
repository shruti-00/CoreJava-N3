package org.tnsif.multilevelinheritance;

//child class
public class Android extends Nokia {

	private String version;
	public void accept()
	{
		System.out.println("The android version is "+version);
	}
	
	//getters and setters method
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public Android() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Android(String version) {
		super();
		this.version = version;
	}
	
	
}

