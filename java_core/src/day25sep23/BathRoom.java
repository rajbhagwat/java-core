package day25sep23;

public class BathRoom {

	int mirrors;

	public int getMirrors() {
		return mirrors;
	}

	public void setMirrors(int mirrors) {
		this.mirrors = mirrors;
	}

	// constructor
	public BathRoom(int mirrors) {
		this.mirrors = mirrors;
	}

	@Override
	public String toString() {
		return "BR->" + this.mirrors;
	}
}