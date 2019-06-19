package ch10proj3Roshambo;

public class Bart extends Player {

	public Bart() {
		super();
		super.setName("Bart");
	}
	public Roshambo generateRoshambo() {
		return Roshambo.rock;
	}
}
