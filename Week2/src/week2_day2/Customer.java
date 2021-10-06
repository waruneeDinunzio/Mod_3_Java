package week2_day2;

public class Customer {
	static int idGen=1;
	private String name;
	private int id;
	//private int invoice;
	private String address;
	private String email;
	private int phone;

	public Customer() {
		this.id = idGen++;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
