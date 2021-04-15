package ro.ase.cts.flyweight.classes;


public class Rezervare {
	private int nrMasa;
	private int nrPers;
	private String oraRezervare;
	
	public Rezervare(int nrMasa, int nrPers, String oraRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPers = nrPers;
		this.oraRezervare = oraRezervare;
	}

	@Override
	public String toString() {
		return "Rezervare [nrMasa=" + nrMasa + ", nrPers=" + nrPers + ", oraRezervare=" + oraRezervare + "]";
	}
	
	
}