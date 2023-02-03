package HouseOfTheDragon;

public class NorthWarden extends Monarch {
	private static String fate = "When winter comes, this monarch needs to defend the "
			+ "seven kingdoms against the white walkers. ";
	@Override
	public boolean succession(Human successor, String title) {
		if ((seated.isDead() || seated == null) && title == this.getName()) {
			seated = successor;
			return true;
		}
		return false;
	}
	
	public String getFate() {return fate;}

}
