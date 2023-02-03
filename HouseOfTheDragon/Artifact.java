package HouseOfTheDragon;

public abstract class Artifact {
	private double resistance;
	private String type;
	
	public double getResistance() {
		return resistance;
	}
	protected void setResistance(double resistance) {
		this.resistance = resistance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
