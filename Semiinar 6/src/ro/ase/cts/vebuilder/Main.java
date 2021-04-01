package ro.ase.cts.vebuilder;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare r = new Rezervare.BuilderV3().setBautura(true).setCod(10).build();
		System.out.println(r.toString());
	}

}