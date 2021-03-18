package ro.ase.cts.main;

import ro.ase.cts.classes.ClinicaVeterinara;
import ro.ase.cts.classes.ClinicaVeterinaraLazy;
import ro.ase.cts.threadsafe.Logodna;

public class Program {

	public static void main(String[] args) {
//		ClinicaVeterinara clinica1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2 = ClinicaVeterinara.getInstance();
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		//ClinicaVeterinaraLazy clinica1 = ClinicaVeterinaraLazy.getInstance("ClinVet", "Strada Independentei", 4, 4500.45f);
		//ClinicaVeterinaraLazy clinica2 = ClinicaVeterinaraLazy.getInstance("VetClin", "Strada Libertatii", 5, 2500.45f);
		
		//System.out.println(clinica1.toString());
		//System.out.println(clinica2.toString());
	
		Logodna logodna1=Logodna.getInstance("David", "Bucuresti", 100, 100000.23f);
		Logodna logodna2=Logodna.getInstance("Ionescu", "Galati", 120, 340000.23f);
	
		System.out.println(logodna1.toString());
		System.out.println(logodna2.toString());
	}

}