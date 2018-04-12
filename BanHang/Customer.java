package BanHang;

public class Customer {
	String name;
	String location;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	

	public Customer(String name, String location) {
		this.name = name;
		this.location = location;
	}



	void sendOrder() {

	}

	void receiveOrder() {

	}
	
	
	
   // get and set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}