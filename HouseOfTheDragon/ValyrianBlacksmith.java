package HouseOfTheDragon;

public class ValyrianBlacksmith extends Forge {
	private Dragon dragon;
	
	public Artifact createArtifact() {
		if (this.getXp()>80 && dragon != null) {
			double care = dragon.getRage() + this.getBlacksmith().getIntelligence();
			return new ValyrianSteel(care);
		}
		else {
			return new CommonSteel(this.getXp() + this.getBlacksmith().getRespect());
		}
	}
	public Dragon getDragon() {
		return dragon;
	}
	public void setDragon(Dragon dragon) {
		this.dragon = dragon;
	}
	
}
