package HouseOfTheDragon;

public class Horse extends Being {
	private double strength;
	private String color;
	
	public Horse(House h) {
		super(h);
	}

	@Override
	public void baptize(String n, House h) {
		this.setHouse(h);
		String lastName;
		if(this.getHouse()!= null)
			lastName = "The " + this.getHouse().getName();
		else
			lastName = "The Bastard";
		this.setName(n + " of " + lastName);
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
