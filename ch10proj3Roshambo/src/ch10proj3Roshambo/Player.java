package ch10proj3Roshambo;

public abstract class Player {
	private String name;
	private Roshambo rsb;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Roshambo getRsb() {
		return rsb;
	}
	public void setRsb(Roshambo rsb) {
		this.rsb = rsb;
	}
	public Roshambo generateRoshambo() {
		return rsb;
	}
	
	
}
