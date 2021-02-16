package dataModels;

public class Car {

	private String licenseNumber;
	private String brand;
	private String color;
	private int km;
	private int group;
	private boolean available;
	private int officeNumber;
	public String img;
	public int dayPrice;
	public int totalPrice;
	public Reservation reservation;
	
	public Car(String licenseNumber, String brand, String color, int km, int group, boolean available,
			int officeNumber, String img, int dayPrice) {
		super();
		this.licenseNumber = licenseNumber;
		this.brand = brand;
		this.color = color;
		this.km = km;
		this.group = group;
		this.available = available;
		this.officeNumber = officeNumber;
		this.img = img;
		this.dayPrice = dayPrice;
		
	}
	public int getDayPrice() {
		return dayPrice;
	}
	
	@Override
	public String toString() {
		return "Car [licenseNumber=" + licenseNumber + ", brand=" + brand + ", color=" + color + ", km=" + km
				+ ", group=" + group + ", available=" + available + ", officeNumber=" + officeNumber + ", img=" + img
				+ ", dayPrice=" + dayPrice + ", totalPrice=" + totalPrice + "]";
	}
	public void setPrice(int days) {
		this.dayPrice *= days;
	}
	
	public int getOfficeNumber() {
		return officeNumber;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public void setOfficeNumber(int officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available, Reservation reservation) {
		this.reservation = reservation;
		this.available = available;
	}
	
	
}
