package dataModels;

public class Card {

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private int number;
	private int cvv;
	private String date;
	
	public int getNumber() {
		return number;
	}
}
