package dataModels;

import java.util.ArrayList;
import java.util.List;

public class Office {
	
	private int officeNumber;
	private Address address;
	private int phoneNumber;
	private List<Car> cars;
	
	
	public Office(int officeNumber, Address address, int phoneNumber, ArrayList<Car> cars) {
		super();
		this.officeNumber = officeNumber;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.cars = cars;
	}
	/**
	 * 
	 * @param car
	 */
	public void returnCar(Car car) {
		car.setOfficeNumber(this.officeNumber);
		cars.add(car);
	}
	public void deliverCar(Car car) {
		car.setOfficeNumber(0);
		cars.remove(car);
	}
	
	public int getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(int officeNumber) {
		this.officeNumber = officeNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	

}
