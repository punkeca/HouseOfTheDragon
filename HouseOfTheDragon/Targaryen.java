package HouseOfTheDragon;

public class Targaryen extends House {
	private double heatResistance;
	private double madness;
	public Targaryen() {
		this.setName("Targaryen");
		this.setSigil("Three Headed Dragon");
		this.setWords("Fire and Blood");
	}
	public Targaryen(double hR, double md){
		this();
		this.heatResistance = hR;
		this.madness = md;
	}
	
	public double getHeatResistance() {
		return heatResistance;
	}
	public void setHeatResistance(double heatResistance) {
		this.heatResistance = heatResistance;
	}
	public double getMadness() {
		return madness;
	}
	public void setMadness(double madness) {
		this.madness = madness;
	}
	
}
