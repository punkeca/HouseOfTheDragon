package HouseOfTheDragon;
import java.util.List;
import java.util.ArrayList;


public class Human extends Being {
		public List<Language> languages = new ArrayList<Language>();
		public List<Artifact> items = new ArrayList<Artifact>();
		private Human spouse;
		private Dragon dragon;
		private Horse horse;
		private boolean dead;
		private double intelligence;
		private double respect;
		private boolean magic;
		
		public Human(House h){
			super(h);
		}
		@Override
		public void baptize(String n, House h) {
			this.setHouse(h);
			String lastName;
			if(this.getHouse()!= null)
				lastName = this.getHouse().getName();
			else
				lastName = "The Bastard";
			this.setName(n + " " + lastName);
		}
		
		public boolean tameDragon(Dragon d) {
			double dragonResistance = d.getRage()* d.getSize();
			double humanInfluence = intelligence * respect;
			if(dragonResistance > humanInfluence) {
				this.dragon = d;
			}
			return false;
		}
		
		public void learnLanguage(Language l){
			languages.add(l);
			respect += l.benefit();
			intelligence += l.benefit();
		}
		
		public void acquireItem(Artifact a){
			items.add(a);
		}
		
		public List<Language> getLanguages() {
			return languages;
		}
		public void setLanguages(List<Language> languages) {
			this.languages = languages;
		}
		public List<Artifact> getItems() {
			return items;
		}
		public void setItems(List<Artifact> items) {
			this.items = items;
		}
		public Human getSpouse() {
			return spouse;
		}

		public void setSpouse(Human spouse) {
			this.spouse = spouse;
		}

		public Horse getHorse() {
			return horse;
		}

		public void setHorse(Horse horse) {
			this.horse = horse;
		}

		public boolean isDead() {
			return dead;
		}

		public void setDead(boolean dead) {
			this.dead = dead;
		}

		public double getIntelligence() {
			return intelligence;
		}

		public void setIntelligence(double intelligence) {
			this.intelligence = intelligence;
		}

		public double getRespect() {
			return respect;
		}

		public void setRespect(double respect) {
			this.respect = respect;
		}

		public boolean isMagic() {
			return magic;
		}

		public void setMagic(boolean magic) {
			this.magic = magic;
		}

		public Dragon getDragon() {
			return dragon;
		}

}
