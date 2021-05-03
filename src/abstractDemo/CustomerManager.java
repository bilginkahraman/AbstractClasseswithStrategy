package abstractDemo;

public class CustomerManager {

	// hatalı sistem
	// Bagımlı oldugumuzdan dolayı iyi bir yazım degildir.
	// OracleDatabaseManager oracleDatabaseManager=new OracleDatabaseManager();
	// oracleDatabaseManager.getData();

	//Burada base sınıf bizim stratejimizi belirliyor.Hangi veri tabanı sistemini
	//verirsek databaseManagerda o calısır.
	BaseDatabaseManager databaseManager;

	public void getCustomers() {
		databaseManager.getData();

	}
}
