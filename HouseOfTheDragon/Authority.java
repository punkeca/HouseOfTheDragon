package HouseOfTheDragon;

import java.util.ArrayList;
import java.util.List;

public abstract class Authority {
	private List<Monarch> titles = new ArrayList<Monarch>();
	abstract void notifyDeath(Human successor, String title);
	
	public List<Monarch> getTitles() {
		return titles;
	}
	public void setTitles(List<Monarch> titles) {
		this.titles = titles;
	}
}
