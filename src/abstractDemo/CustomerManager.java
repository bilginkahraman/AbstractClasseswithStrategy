package abstractDemo;

public class CustomerManager {

	// hatal� sistem
	// Bag�ml� oldugumuzdan dolay� iyi bir yaz�m degildir.
	// OracleDatabaseManager oracleDatabaseManager=new OracleDatabaseManager();
	// oracleDatabaseManager.getData();

	//Burada base s�n�f bizim stratejimizi belirliyor.Hangi veri taban� sistemini
	//verirsek databaseManagerda o cal�s�r.
	BaseDatabaseManager databaseManager;

	public void getCustomers() {
		databaseManager.getData();

	}
}
