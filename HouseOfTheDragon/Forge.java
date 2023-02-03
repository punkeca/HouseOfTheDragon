package HouseOfTheDragon;

public abstract class Forge {
	private Human blacksmith = new Human(null);
	private double xp;
	
	public abstract Artifact createArtifact();
	
	public Human getBlacksmith() {
		return blacksmith;
	}
	public void setBlacksmith(Human blacksmith) {
		this.blacksmith = blacksmith;
	}
	public double getXp() {
		return xp;
	}
	public void setXp(double xp) {
		this.xp = xp;
	}
	
}
