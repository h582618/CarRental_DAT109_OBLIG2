package dataModels;

import java.util.ArrayList;
import java.util.List;

public class CarRental {
	private String name;
	private int phoneNumber;
	private Address companyAddress;
	private List<Office> offices;
	
	public CarRental() {
		
	}
	public CarRental(String name, int phoneNumber, Address companyAddress) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.companyAddress = companyAddress;
		this.offices = new ArrayList<Office>();
	}

	public List<Car> totalCars() {
		
		List<Car> cars = new ArrayList<Car>();
		
		for(Office office : offices) {
			cars.addAll(office.getCars());
		}
		return cars;
	}
	
	public void addOffice(Office office) {
		offices.add(office);
	}
	
	public void removeOffice(Office office) {
		offices.remove(office);
	}
	
	public List<Office> getOffices() {
		return offices;
	}

	public void setOffices(List<Office> offices) {
		this.offices = offices;
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