package HouseOfTheDragon;

public class Valyrian extends Language{
	private double dragonCharm;
	private String variation;
	
	public Valyrian() {
		this.setComplexity(90);
		this.setOrigin("Valyria");
		this.setName("Valyrian");
	}
	@Override
	public double benefit() {
		return dragonCharm;
	}
	
	public double getDragonCharm() {
		return dragonCharm;
	}
	public void setDragonCharm(double dragonCharm) {
		this.dragonCharm = dragonCharm;
	}
	public String getVariation() {
		return variation;
	}
	public void setVariation(String variation) {
		this.variation = variation;
	}
	
}
