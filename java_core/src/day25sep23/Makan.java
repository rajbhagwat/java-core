package day25sep23;

public class Makan {
	int rooms;
	int price;
	String owner;
	Hamam h;
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Hamam getH() {
		return h;
	}
	public void setH(Hamam h) {
		this.h = h;
	}
	
	// constructor
	public Makan(int rooms, int price, String owner, Hamam h)
	{
		this.rooms = rooms;
		this.price = price;
		this.owner = owner;
		this.h     = h;
	}
	@Override
	public String toString() {
		return "Makan [rooms=" + rooms + ", price= " + price + ", owner=" + owner + ", h=" + h + "]";
	}
	public static void main(String[] args) {
		Hamam h1 = new Hamam(10);
		
		Makan m = new Makan(6, 123456,"Cyber",h1);
		System.out.println(m.toString());
	}
	
}
