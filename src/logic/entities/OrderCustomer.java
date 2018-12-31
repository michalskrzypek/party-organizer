package logic.entities;

public class OrderCustomer {

	private String firstName;
	private String surname;
	private String nationalID;
	private String phoneNumber;

	public OrderCustomer(String firstName, String surname, String nationalID) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.nationalID = nationalID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
