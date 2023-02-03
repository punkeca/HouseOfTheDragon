package HouseOfTheDragon;

public class App {

	public static void main(String[] args) {
		//initial declarations
		House targaryen = new Targaryen(80,25);
		House velaryon = new Velaryon();
		Human rhaenyra = new Human(targaryen);
		Dragon syrax = new Dragon(targaryen);
		IronThrone ironThrone = new IronThrone();
		SmallCouncil sm = new SmallCouncil();
		NorthWarden nw = new NorthWarden();
		
		rhaenyra.setIntelligence(100);
		rhaenyra.setRespect(100);
		rhaenyra.setBirthdate("97 a.C"); //a.C after Aegon's conquest
		rhaenyra.baptize("Rhaenyra", targaryen);
		
		//creating languages for Rhaenyra
		Valyrian v = new Valyrian();
		v.setVariation("HighValyrian");
		v.setDragonCharm(100);
		
		Dothraki d = new Dothraki();
		d.setAgression(90);
		d.setHorseCharm(90);
		
		rhaenyra.learnLanguage(v);
		rhaenyra.learnLanguage(d);
		
		//adding details to Syrax
		syrax.setRage(60);
		syrax.setSize(50);
		syrax.baptize("Syrax", targaryen);
		
		rhaenyra.tameDragon(syrax);
		
		rhaenyra.setHorse(new Horse(targaryen));
		rhaenyra.getHorse().baptize("Nightmare", targaryen);
		
		//creating and giving Rhaenyra some artifacts
		ValyrianBlacksmith vb = new ValyrianBlacksmith();
		CommonBlacksmith cb = new CommonBlacksmith();
		
		Human b = vb.getBlacksmith();
		cb.setBlacksmith(b);
		b.setRespect(1000);
		b.setIntelligence(1000);
		
		vb.setDragon(new Dragon(null));
		
		rhaenyra.acquireItem(cb.createArtifact());
		rhaenyra.acquireItem(vb.createArtifact());
		//creating her children
		Human jace = new Human(targaryen);
		Human luke = new Human(targaryen);
		Human joff = new Human(targaryen);
		
		jace.baptize("Jaecerys", velaryon);
		luke.baptize("Lucerys", velaryon);
		joff.baptize("Joffrey", velaryon);
	
		//making Rhaenyra Queen and Warden Of the North
		ironThrone.setName("IronThrone");
		sm.setAllegiance("Blacks");
		sm.notifyDeath(rhaenyra, "IronThrone");
		
		nw.setName("NorthWarden");
		sm.notifyDeath(rhaenyra, "NorthWarden");
		
		System.out.println("Queen " + rhaenyra.getName() + ", first of her name. ");
		System.out.println(ironThrone.getAnnouncement());
		System.out.println("With her sons, " + jace.getName() + ", " + luke.getName() + " and " + joff.getName()+ ". ");
		System.out.println("And her dragon, " + syrax.getName() + ". ");
		System.out.println("Long live the " + targaryen.getSigil() + ". May " + targaryen.getWords() + " prevail.");
		System.out.println(nw.getFate());
	}

}
