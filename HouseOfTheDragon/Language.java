package HouseOfTheDragon;

public abstract class Language {
	private String name;
	private double complexity;
	private String origin;
	
	public abstract double benefit();
	
	public double getComplexity() {
		return complexity;
	}
	public void setComplexity(double complexity) {
		this.complexity = complexity;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String n) {this.name = n;}
	
}
