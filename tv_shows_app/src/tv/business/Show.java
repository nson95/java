package tv.business;

public class Show {
	private int ID;
	private String name;
	private String rating;
	private int length;
	private String genre;
	private String network;
	
	
	public Show(int iD, String name, String rating, int length, String genre, String network) {
		ID = iD;
		this.name = name;
		this.rating = rating;
		this.length = length;
		this.genre = genre;
		this.network = network;
	}
	public Show(String name, String rating, int length, String genre, String network) {
		this.name = name;
		this.rating = rating;
		this.length = length;
		this.genre = genre;
		this.network = network;
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	
	
	@Override
	public String toString() {
		return "Show [ID=" + ID + ", name=" + name + ", rating=" + rating + ", length=" + length + ", genre=" + genre
				+ ", network=" + network + "]";
	}
	

}
