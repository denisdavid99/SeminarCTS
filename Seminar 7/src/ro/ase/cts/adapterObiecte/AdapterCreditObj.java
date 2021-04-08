package ro.ase.cts.adapterObiecte;

import ro.ase.cts.adapterClase.Leasing;

public class AdapterCreditObj implements InterfataCredit{
	private Leasing leasing;

	public AdapterCreditObj(ro.ase.cts.adapterClase.Leasing leasing2) {
		super();
		this.leasing = leasing2;
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		this.leasing.oferaLeasing(numeClient, suma);		
	}
}