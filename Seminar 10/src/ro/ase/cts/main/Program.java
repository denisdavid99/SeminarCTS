package ro.ase.cts.main;

import ro.ase.cts.command.Constituie;
import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.Depunere;
import ro.ase.cts.command.ManagerComenzi;
import ro.ase.cts.command.Retragere;


public class Program {

	public static void main(String[] args) {
		
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new Constituie(new ContBancar("Cosmina"), 500));
		manager.invoca(new Retragere(new ContBancar("Alisa"), 200));
		manager.executaComanda();
		
		manager.invoca(new Depunere(new ContBancar("Oana"), 100));
		manager.executaComanda();
		manager.executaComanda();

	}

}