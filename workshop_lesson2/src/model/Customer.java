package model;

public class Customer {
	private int id;
	private String name;
	private String tel;
	private String username;
	private String password;

	public Customer(int id, String name, String tel, String username, String password) {

		this.id = id;
		this.name = name;
		this.tel = tel;
		this.username = username;
		this.password = password;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setUsername(String Username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer[id= " + id + ", name= " + name + ", tel= " + tel + ", username= " + username + ", password= "
				+ password + " ]";

	}
}
