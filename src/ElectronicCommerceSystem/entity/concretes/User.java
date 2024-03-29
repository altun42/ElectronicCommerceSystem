package ElectronicCommerceSystem.entity.concretes;

import ElectronicCommerceSystem.entity.abstracts.Entity;

public class User implements Entity{
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	public User() {
		
	}
	public User(String firstName, String lastName, String eMail, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}
	public String getFirstName() {
		if (this.firstName.length()<2) {
			System.out.println("Kullan�c� ad� en az iki karakter i�ermelidir");
			
		}
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		if (this.lastName.length()<2) {
			System.out.println("Kullan�c� soyad� en az iki karakter i�ermelidir");
			
		}
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
