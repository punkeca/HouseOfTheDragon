package HouseOfTheDragon;

public class Dothraki extends Language {
	private double agression;
	private double horseCharm;
	
	public Dothraki() {
		this.setComplexity(70);
		this.setOrigin("The Great Grass Sea");
		this.setName("Dothraki");
	}
	@Override
	public double benefit() {
		return (agression + horseCharm) / 2;
	}
	public double getAgression() {
		return agression;
	}
	public void setAgression(double agression) {
		this.agression = agression;
	}
	public double getHorseCharm() {
		return horseCharm;
	}
	public void setHorseCharm(double horseCharm) {
		this.horseCharm = horseCharm;
	}

}
