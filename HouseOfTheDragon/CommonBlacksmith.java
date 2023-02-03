package HouseOfTheDragon;

public class CommonBlacksmith extends Forge {
	public Artifact createArtifact() {
		return new CommonSteel(this.getXp() + this.getBlacksmith().getRespect());
	}
}
