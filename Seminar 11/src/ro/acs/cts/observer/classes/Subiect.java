package ro.acs.cts.observer.classes;


public interface Subiect {
	
	void aboneazaClient(Observer observer);
	void dezaboneazaClient(Observer observer);
	void trimiteMesaj(String mesaj);
}