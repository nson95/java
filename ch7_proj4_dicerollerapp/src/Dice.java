
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
	
	

}
