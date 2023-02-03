package HouseOfTheDragon;

public class Dragon extends Being {
	private double size;
	private double rage;

	public Dragon(House h) {
		super(h);
	}
	@Override
	public void baptize(String n, House h) {
		this.setHouse(h);
		this.setName(n + " of The " + h.getName());
	}
	
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getRage() {
		return rage;
	}
	public void setRage(double rage) {
		this.rage = rage;
	}

}
