package ro.ase.cts.chain.main;

import ro.ase.cts.chain.Cont;
import ro.ase.cts.chain.ContCredit;
import ro.ase.cts.chain.ContCurent;
import ro.ase.cts.chain.ContEconomii;
import ro.ase.cts.chain.ContIndisponibil;

public class Program {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent(1500, "Madalin", null );
		Cont contEconomii = new ContEconomii(2500, "Madalin", null);
		Cont contCredit = new ContCredit(3200, "Madalin", null);
		Cont contIndisponibil = new ContIndisponibil("Madalin");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		
		contCurent.plateste(3500);
	}

}