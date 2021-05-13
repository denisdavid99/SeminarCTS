package ro.acs.cts.template.main;

import ro.acs.cts.template.classes.Spectator;
import ro.acs.cts.template.classes.SpectatorPeluza;

public class Program {
	
	public static void main(String[] args) {
		Spectator spectator = new Spectator();
		spectator.intrareSpectatorPeStadion();
		
		SpectatorPeluza spectatorPeluza = new SpectatorPeluza();
		spectatorPeluza.intrareSpectatorPeStadion();
	}
}