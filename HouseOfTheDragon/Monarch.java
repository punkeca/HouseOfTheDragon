package HouseOfTheDragon;

public abstract class Monarch {
	protected Human seated;
	private String name;
	public abstract boolean succession( Human successor, String title);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
