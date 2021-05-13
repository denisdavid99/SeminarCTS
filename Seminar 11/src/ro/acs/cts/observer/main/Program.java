package ro.acs.cts.observer.main;

import ro.acs.cts.observer.classes.ClientAbonat;
import ro.acs.cts.observer.classes.Sala;

public class Program {

	public static void main(String[] args) {
		ClientAbonat clientPopescu = new ClientAbonat("Popescu");
		ClientAbonat clientVasilescu = new ClientAbonat("Vasilescu");
		ClientAbonat clientIonescu = new ClientAbonat("Ionescu");
		
		Sala sala = new Sala("Sala sportiva");
		
		sala.aboneazaClient(clientIonescu);
		sala.aboneazaClient(clientVasilescu);
		sala.aboneazaClient(clientPopescu);
		sala.anuntaMeciFotbal();
		sala.dezaboneazaClient(clientIonescu);
		sala.anuntaMeciVolei();
	}

}