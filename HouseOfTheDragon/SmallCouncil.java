package HouseOfTheDragon;

public class SmallCouncil extends Authority {
	private String allegiance;
	@Override
	public void notifyDeath(Human successor, String title) {
	 for (Monarch x : this.getTitles()) {
		 x.succession(successor, title);
	 }
	}
	

	public String getAllegiance() {
		return allegiance;
	}

	public void setAllegiance(String allegiance) {
		this.allegiance = allegiance;
	}

}
