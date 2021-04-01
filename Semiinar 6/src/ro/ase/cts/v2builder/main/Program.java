package ro.ase.cts.v2builder.main;

import ro.ase.cts.v1builder.classes.Rezervare;
import ro.ase.cts.v2builder.classes.BuilderV2;

public class Program {

	public static void main(String[] args) {
		BuilderV2 builder = new BuilderV2();
		builder.setBauturaRacoritoare(true);
		builder.setMancareInclusa(true);
		
		ro.ase.cts.v2builder.classes.Rezervare rezervare1 = builder.setCodRezervare(5).build();
		ro.ase.cts.v2builder.classes.Rezervare rezervare2 = builder.setCodRezervare(6).build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
	}

}