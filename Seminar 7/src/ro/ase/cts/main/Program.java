	package ro.ase.cts.main;

import ro.ase.cts.adapterClase.AdapterCredit;
import ro.ase.cts.adapterClase.InterfataCredit;
import ro.ase.cts.adapterClase.Leasing;
import ro.ase.cts.adapterObiecte.AdapterCreditObj;

public class Program {
public static void oferaInfoCredit(AdapterCreditObj adapter, String numeClient, float suma) {
	adapter.acordaCredit(numeClient, suma);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Leasing leasing = new Leasing();
	AdapterCreditObj adapter = new AdapterCreditObj(leasing);
	oferaInfoCredit(adapter, "Ionel", 245.50f);

}

}
	

