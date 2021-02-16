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

	public void setNumber(String number) {
		this.number = number;
	}

	private String number;
	private int cvv;
	private String date;
	
	public String getNumber() {
		return number;
	}

	public Card(String number, int cvv, String date) {
		super();
		this.number = number;
		this.cvv = cvv;
		this.date = date;
	}
}
