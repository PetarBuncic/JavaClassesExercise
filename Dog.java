package annimals;

public class Dog extends Annimal {
	
	public String name;
	public String race;
	
	public Dog(String name) {
		super("pas");
		this.name=name;
		this.race="bernandinac";
	}
	public Dog(String name, String rasa) {
		super("pas");
		this.name=name;
		this.race=rasa;
	}
	
	@Override
	public String toString() {
		
		return ("Ova zivotinja je:"+ vrsta+ " "+ race + " "+  name );
		
	}
	
	

}
