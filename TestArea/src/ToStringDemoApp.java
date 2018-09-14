
public class ToStringDemoApp {

	public static void main(String[] args) {
		System.out.println("ToStringDemoApp says yo..");
		
		
		Toy t1 = new Toy(0, "Stuffy", 10);
		
		System.out.println("t1: " +t1);
		System.out.println("t1 toString: " +t1.toString());
		
		BoardGame bg2 = new BoardGame(1, "cl", 15, "Candy Land", 44);
		
		bg2.setId(1);
		bg2.setCode("sorry");
		bg2.setName("Sorry");
		
		System.out.println(bg2);
		System.out.println("t1 fields: " +t1.getId() +t1.getCode() +t1.getPrice());
		System.out.println("Goobye");

	}
	

}
