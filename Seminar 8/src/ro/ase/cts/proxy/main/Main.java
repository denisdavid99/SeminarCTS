package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.classes.IRezervare;
import ro.ase.cts.proxy.classes.ProxyRezervare;
import ro.ase.cts.proxy.classes.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRezervare rez = new Rezervare(1, 2);
		rez.anuntaRezervare();
		ProxyRezervare proxy = new ProxyRezervare((Rezervare) rez);
		proxy.anuntaRezervare();
		((Rezervare)rez).setNrPers(4);
		proxy.anuntaRezervare();
	}

}