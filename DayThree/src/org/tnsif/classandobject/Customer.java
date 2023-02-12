package org.tnsif.classandobject;

public class Customer {
		// TODO Auto-generated constructor stub
//		int id;
//		String custname;
//		String city;
	
		//
		private int id;
		private String custname;
		private String city;
		
		public Customer() {
			//default constructor
		}
		public Customer(int id, String custname, String city) {
			super();
			this.id = id;
			this.custname = custname;
			this.city = city;
		}
		
		void display()
		{
			System.out.println(id+custname+city);
		}
		
		//getters and setters 
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCustname() {
			return custname;
		}
		public void setCustname(String custname) {
			this.custname = custname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}

}
