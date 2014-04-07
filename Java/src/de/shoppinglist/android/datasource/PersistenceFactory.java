package de.shoppinglist.android.datasource;

public class PersistenceFactory {
	
	private static PersistenceFactory instance;
	private ShoppingListPersistence shoppingListPersistence;
	
	private PersistenceFactory(){
	}
	
	public static PersistenceFactory getInstance(){
		if (instance == null)
			instance = new PersistenceFactory();
		return instance;
	}
	
	public IPersistence getShoppingListPersistence(ShoppinglistDataSource datasource){
		if (shoppingListPersistence == null)
			shoppingListPersistence = new ShoppingListPersistence(datasource);
		return shoppingListPersistence;
	}

}
