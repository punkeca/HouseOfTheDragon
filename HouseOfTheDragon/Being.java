package HouseOfTheDragon;

public abstract class Being {
	private House house;
	private String name;
	private String birthdate;
	

	public Being(House h) {
		this.house = h;
	}
	
	public abstract void baptize(String n, House h);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public House getHouse() {
		return house;
	}
	
	public void setHouse(House h) {
		this.house = h;
	}
}
