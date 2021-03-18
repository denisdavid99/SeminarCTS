package ro.ase.cts.threadsafe;

public class Logodna {
	
		private static Logodna instanta = null;
		private String nume;
		private String locatie;
		private int numarParticipanti;
		private float buget;
		
		private Logodna(String nume, String locatie, int numarParticipanti, float buget) {
			super();
			this.nume = nume;
			this.locatie = locatie;
			this.numarParticipanti = numarParticipanti;
			this.buget = buget;
		}

		public static  synchronized Logodna getInstance(String nume, String locatie, int numarParticipanti, float buget)
		{
			if(instanta == null)
			{
				instanta = new Logodna(nume, locatie, numarParticipanti, buget);
			}
			return instanta;
		}

		
		
		public static Logodna getInstanta() {
			return instanta;
		}

		public static void setInstanta(Logodna instanta) {
			Logodna.instanta = instanta;
		}

		public String getNume() {
			return nume;
		}

		public void setNume(String nume) {
			this.nume = nume;
		}

		public String getLocatie() {
			return locatie;
		}

		public void setLocatie(String locatie) {
			this.locatie = locatie;
		}

		public int getNumarParticipanti() {
			return numarParticipanti;
		}

		public void setNumarParticipanti(int numarParticipanti) {
			this.numarParticipanti = numarParticipanti;
		}

		public float getBuget() {
			return buget;
		}

		public void setBuget(float buget) {
			this.buget = buget;
		}

		@Override
		public String toString() {
			return "Logodna [nume=" + nume + ", locatie=" + locatie + ", numarParticipanti=" + numarParticipanti
					+ ", buget=" + buget + "]";
		}
		
}
