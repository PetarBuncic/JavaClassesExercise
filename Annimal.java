package annimals;

public class Annimal {
	public String vrsta;
	
	public Annimal(String vrsta) {
		this.vrsta=new String(vrsta);
	}
	@Override
	public String toString() {
		return "Ovo je"+ vrsta;
	}
	
}
