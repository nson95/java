
public class Grade {
	private int number;

	public Grade() {
		super();
		number=0;
	}

	public Grade(int number) {
		super();
		this.number = number;
		
	}
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	} 

	public String getLetter() {
		String lettergrade ="";
		if (number >= 88) {
			lettergrade = "A";
		} else if (number >= 80) {
			lettergrade = "B";
		} else if (number >= 68) {
			lettergrade = "C";
		} else if (number >= 60) {
			lettergrade = "D";
		} else {
			lettergrade = "F";
		}
		return lettergrade;
	}
}
