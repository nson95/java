package ch10proj3Roshambo;

public class Lisa extends Player {

	public Lisa() {
		super();
		Roshambo rsb;
		super.setName("Lisa");
	}
	public Roshambo generateRoshambo() {
		int l = (int) (Math.random()*3+0);
		 if (l==0) 
			 return Roshambo.rock;
		 else if (l==1)
			 return Roshambo.paper;
		 else 
			 return Roshambo.scissors;
	}
}
