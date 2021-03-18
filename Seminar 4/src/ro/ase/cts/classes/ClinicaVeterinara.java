package ro.ase.cts.classes;

public class ClinicaVeterinara {
	private String nume;
	private String adresa;
	private int numarMedici;
	private float buget;
	
	
	private static final ClinicaVeterinara clinica =new ClinicaVeterinara("Clinica Vet","Str.Dorobanti",5,30000.2f);

	
	private ClinicaVeterinara(String nume, String adresa, int numarMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.numarMedici = numarMedici;
		this.buget = buget;
	}
	
	
	public static ClinicaVeterinara getInstance() {
		return clinica;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinara [nume=" + nume + ", adresa=" + adresa + ", numarMedici=" + numarMedici + ", buget="
				+ buget + "]";
	}
	
	
}