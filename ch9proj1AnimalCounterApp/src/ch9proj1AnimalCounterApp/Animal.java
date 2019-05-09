package ch9proj1AnimalCounterApp;

public class Animal implements Countable {
	public int count;

	@Override
	public void incrementCount() {
		this.count=count+1;
	}

	@Override
	public void resetCount() {
		this.count=0;
	}

	@Override
	public int getCount() {
		return this.count;
	}
	public void setCount() {
	}

	@Override
	public String getCountString() {
		return null;
	}
	
}
