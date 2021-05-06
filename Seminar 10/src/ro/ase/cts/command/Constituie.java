package ro.ase.cts.command;


public class Constituie extends Command{

	public Constituie(ContBancar cont,float suma) {
		super(cont, suma);
	}

	@Override
	public void executa() {
		super.getCont().constituire(super.getSuma());		
	}	
}