package HouseOfTheDragon;

public class ValyrianSteel extends Artifact {
	private String name;
	private double enchantment;
	
	protected ValyrianSteel(double care){
		this.enchantment = care;
		this.setResistance(care*1000);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEnchantment() {
		return enchantment;
	}
}
