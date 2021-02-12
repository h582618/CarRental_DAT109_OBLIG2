package dataModels;

import java.util.Date;

public class Reservation {

	private Customer customer;
	private Card creditCard;
	private int licenseNumber;
	private int pickupKM;
	private Date pickupDateTime;
	private Office pickupOffice;
	private Date returnDateTime;
	private Office returnOffice;
	private int returnKm;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Card getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(Card creditCard) {
		this.creditCard = creditCard;
	}
	public int getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public int getPickupKM() {
		return pickupKM;
	}
	public void setPickupKM(int pickupKM) {
		this.pickupKM = pickupKM;
	}
	public Date getPickupDateTime() {
		return pickupDateTime;
	}
	public void setPickupDateTime(Date pickupDateTime) {
		this.pickupDateTime = pickupDateTime;
	}
	public Office getPickupOffice() {
		return pickupOffice;
	}
	public void setPickupOffice(Office pickupOffice) {
		this.pickupOffice = pickupOffice;
	}
	public Date getReturnDateTime() {
		return returnDateTime;
	}
	public void setReturnDateTime(Date returnDateTime) {
		this.returnDateTime = returnDateTime;
	}
	public Office getReturnOffice() {
		return returnOffice;
	}
	public void setReturnOffice(Office returnOffice) {
		this.returnOffice = returnOffice;
	}
	public int getReturnKm() {
		return returnKm;
	}
	public void setReturnKm(int returnKm) {
		this.returnKm = returnKm;
	}
	
	
	
	
}
