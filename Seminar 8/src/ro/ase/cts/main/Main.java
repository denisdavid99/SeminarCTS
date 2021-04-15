package ro.ase.cts.main;

import ro.ase.cts.classes.IOptiuniMeniu;
import ro.ase.cts.classes.Item;
import ro.ase.cts.classes.Sectiune;

public class Main {
	
	public static void main(String[] args) {
		IOptiuniMeniu meniu = new Sectiune("Meniu restaurant");
		IOptiuniMeniu optiune1 = new Sectiune("Bauturi");
		IOptiuniMeniu optiune2 = new Sectiune("Desert");
		
		IOptiuniMeniu item1 = new Item("Frappe");
		IOptiuniMeniu item2 = new Item("Apa plata");
		IOptiuniMeniu item3 = new Item("Papanasi");
		try {
			optiune1.adaugaNod(item1);
			optiune1.adaugaNod(item2);
			
			optiune2.adaugaNod(item3);
			
			meniu.adaugaNod(optiune1);
			meniu.adaugaNod(optiune2);
			
			meniu.descriere();
			
			optiune1.stergeNod(item1);
			optiune2.adaugaNod(item1);
			
			meniu.descriere();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}