package ch9proj1AnimalCounterApp;

public class Alligator extends Animal {
	public int count;

	public Alligator(int count) {
		this.count = count;
	}
	public String getCountString() {
		return count +" alligators";
	}
}
