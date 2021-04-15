package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.classes.FabricaRezervari;
import ro.ase.cts.proxy.classes.Rezervare;

public class Main {
	public static void main(String[] args) {
		Rezervare rez1 = new Rezervare(1,2);
		Rezervare rez2 = new Rezervare(2,5);
		
		FabricaRezervari fabrica = new FabricaRezervari();
		fabrica.getClient("dani@gmail.com").afisareInfo(rez1);
		fabrica.getClient("dani@gmail.com").afisareInfo(rez2);
		Rezervare rez3 = new Rezervare(2,4);
		fabrica.getClient("email").afisareInfo(rez3);
				
	}
}