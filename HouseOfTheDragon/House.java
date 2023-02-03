package HouseOfTheDragon;

public abstract class House {
	private String name;
	private String sigil;
	private String words;
	
	public String getName() {
		return name;
	}
	public String getSigil() {
		return sigil;
	}
	public String getWords() {
		return words;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected void setSigil(String sigil) {
		this.sigil = sigil;
	}
	protected void setWords(String words) {
		this.words = words;
	}
	
}
