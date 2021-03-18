package ro.ase.cts.classes;

public class ClinicaVeterinaraLazy {
	private String nume;
	private String adresa;
	private int nrMedici;
	private float buget;
	
	private static ClinicaVeterinaraLazy instanta=null;

	private ClinicaVeterinaraLazy(String nume, String adresa, int numarMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrMedici = numarMedici;
		this.buget = buget;
	}
	
	public static ClinicaVeterinaraLazy getInstance(String nume,String adresa, int nrDoctori,float buget) {
		if(instanta==null) {
			instanta = new ClinicaVeterinaraLazy(nume,adresa,nrDoctori,buget);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinaraLazy [nume=" + nume + ", adresa=" + adresa + ", nrMedici=" + nrMedici + ", buget="
				+ buget + "]";
	}
	
	

}
