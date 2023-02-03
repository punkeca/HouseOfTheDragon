package HouseOfTheDragon;

public class Velaryon extends House {
	private double fleetSize;
	private double seaSkill;
	
	public Velaryon() {
		this.setName("Velaryon");
		this.setSigil("Seahorse");
		this.setWords("The Old, the True, the Brave");
	}
	
	public Velaryon(double fs, double sk) {
		this();
		this.fleetSize = fs;
		this.seaSkill = sk;
	}

	public double getFleetSize() {
		return fleetSize;
	}

	public void setFleetSize(double fleetSize) {
		this.fleetSize = fleetSize;
	}

	public double getSeaSkill() {
		return seaSkill;
	}

	public void setSeaSkill(double seaSkill) {
		this.seaSkill = seaSkill;
	}
	
}
