package day25sep23;

public class Flat {
	int      rooms;
	int      price;
	String   name;
	BathRoom br;
	
	public BathRoom getBr() {
		return br;
		
	}
	public void setBr(BathRoom br) {
		this.br = br;
		
	}
	public int getRooms() {
		return rooms;
		
	}
	public void setRoom(int rooms) {
		this.rooms = rooms;
	}
	public int getPrice(int price) {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return this.rooms + " : " + this.price + " : " + this.name + " : " + this.br;
		
	}
	public Flat(int rooms, int price, String name, BathRoom br)
	{
		this.rooms = rooms;
		this.price = price;
		this.name  = name;
		this.br    = br;
	}
	public static void main(String[] args) {
		BathRoom br = new BathRoom(3);
		
		Flat flat = new Flat(4, 120000, "Cyber", br);
		System.out.println(flat.toString());
	}
	}

