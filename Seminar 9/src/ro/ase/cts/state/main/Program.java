package ro.ase.cts.state.main;

import ro.ase.cts.state.classes.Masa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa = new Masa(101);
		masa.rezervaMasa();
		masa.rezervaMasa();
		//masa.setStareMasa(new StareLibera());
		masa.ocupaMasa();
		masa.elibereazaMasa();
	}

}