package dataModels;

import java.time.LocalDate;
import java.util.Date;

public class Reservation {

	private Customer customer;
	private Card creditCard;
	private String licenseNumber;
	private int pickupKM;
	private LocalDate pickupDateTime;
	private Office pickupOffice;
	private LocalDate returnDateTime;
	private Office returnOffice;
	private int returnKm;
	boolean finish = false;
	
	
	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public Reservation(Customer customer, Card creditCard, String licenseNumber, int pickupKM, LocalDate pickupDateTime,
			Office pickupOffice, LocalDate returnDateTime, Office returnOffice) {
		this.customer = customer;
		this.creditCard = creditCard;
		this.licenseNumber = licenseNumber;
		this.pickupKM = pickupKM;
		this.pickupDateTime = pickupDateTime;
		this.pickupOffice = pickupOffice;
		this.returnDateTime = returnDateTime;
		this.returnOffice = returnOffice;
		
	}
	
	/*
	public Reservation(int licenseNumber, int pickupKM, Date pickupDateTime,
			Office pickupOffice, Date returnDateTime, Office returnOffice, int returnKm) {
		this.licenseNumber = licenseNumber;
		this.pickupKM = pickupKM;
		this.pickupDateTime = pickupDateTime;
		this.pickupOffice = pickupOffice;
		this.returnDateTime = returnDateTime;
		this.returnOffice = returnOffice;
		this.returnKm = returnKm;
		
	}
	*/
	

	
	public Customer getCustomer() {
		return customer;
	}
	@Override
	public String toString() {
		return "Reservation [customer=" + customer + ", creditCard=" + creditCard + ", licenseNumber=" + licenseNumber
				+ ", pickupKM=" + pickupKM + ", pickupDateTime=" + pickupDateTime + ", pickupOffice=" + pickupOffice
				+ ", returnDateTime=" + returnDateTime + ", returnOffice=" + returnOffice + ", returnKm=" + returnKm
				+ "]";
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
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public int getPickupKM() {
		return pickupKM;
	}
	public void setPickupKM(int pickupKM) {
		this.pickupKM = pickupKM;
	}
	public LocalDate getPickupDateTime() {
		return pickupDateTime;
	}
	public void setPickupDateTime(LocalDate pickupDateTime) {
		this.pickupDateTime = pickupDateTime;
	}
	public Office getPickupOffice() {
		return pickupOffice;
	}
	public void setPickupOffice(Office pickupOffice) {
		this.pickupOffice = pickupOffice;
	}
	public LocalDate getReturnDateTime() {
		return returnDateTime;
	}
	public void setReturnDateTime(LocalDate returnDateTime) {
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
