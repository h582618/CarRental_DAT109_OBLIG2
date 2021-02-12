package dataModels;

public class CarRental {
	private String name;
	private int phoneNumber;
	private Address companyAddress;
	
	public CarRental() {
		
	}
	
	public CarRental(String name, int phoneNumber, Address companyAddress) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.companyAddress = companyAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}
}