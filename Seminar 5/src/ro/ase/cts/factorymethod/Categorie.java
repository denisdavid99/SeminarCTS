package ro.ase.cts.factorymethod;

public abstract class Categorie {
	float pretDeBaza;

	public Categorie(float pretDeBaza) {
		this.pretDeBaza = pretDeBaza;
	}

	@Override
	public String toString() {
		return "Categorie [pretDeBaza=" + pretDeBaza + "]";
	}
	
	

}
