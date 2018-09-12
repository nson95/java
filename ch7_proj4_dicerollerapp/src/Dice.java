
public class Dice {
	private Die die1;
	private Die die2;
	
	
	public Dice() {
		die1=new Die();
		die2=new Die();
	}


	public Die getDie1() {
		return die1;
	}


	public void setDie1(Die die1) {
		this.die1 = die1;
	}


	public Die getDie2() {
		return die2;
	}


	public void setDie2(Die die2) {
		this.die2 = die2;
	}
	
	public int getSum() {
		return die1.getValue()+die2.getValue();
	}


	@Override
	public String toString() {
		return "Die 1: " + die1  + "\n" 
				+ "Die 2: " + die2 + "\n"
				+ "Total: " +getSum() +"\n" 
				+displaySpecialMessage();
	}
	
	private String displaySpecialMessage() {
		String s = "";
		if (getSum()==7) {
			s = "Craps";
		} else if (getSum()==12) {
			s = "Box Cars!";
		} else if (getSum()==2) {
			s = "Snake Eyes!";
		}
		s+= "\n";
		return s;
	}
	
}
