package ro.acs.cts.template.classes;


public abstract class SpectatorAbstract {

	public abstract void asezareLaCoada();
	public abstract void prezintaBilet();
	public abstract void realizeazaControlCorporal();
	public abstract void intraPeStadion();
	public abstract void ocupaLoc();
	
	public final void intrareSpectatorPeStadion() {
		asezareLaCoada();
		prezintaBilet();
		realizeazaControlCorporal();
		intraPeStadion();
		ocupaLoc();
	}
}