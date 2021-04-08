package ro.ase.cts.adapterClase;
public class AdapterCredit extends Leasing implements InterfataCredit{

	
		
		

		public AdapterCredit() {
			super();
		}
		
		

		@Override
		public void acordaCredit(String numeClient, float suma) {
			// TODO Auto-generated method stub
			super.oferaLeasing(numeClient, suma);
		}

	}