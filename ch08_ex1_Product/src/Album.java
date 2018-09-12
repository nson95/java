
public class Album extends Product {
	private String artist;
	
	
	public Album(String code, String description, double price, int count, String artist) {
		super();
		this.artist = artist;
	} 
	
	public  Album() {
		super();
		artist = "";
	}

	public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
    



	

	

	public void setCount(int count) {
		this.count = count;
	}

	public String toString() {
		return super.toString() +" " +artist;
	}
}
