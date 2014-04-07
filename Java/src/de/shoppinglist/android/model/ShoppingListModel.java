package de.shoppinglist.android.model;


import java.util.List;

import de.shoppinglist.android.bean.Shoppinglist;
import de.shoppinglist.android.bean.ShoppinglistProductMapping;
import de.shoppinglist.android.datasource.ShoppingListPersistence;
import de.shoppinglist.android.datasource.ShoppinglistDataSource;
import android.content.Context;

public class ShoppingListModel{
	
	private static ShoppingListModel instance;
	private static ShoppinglistDataSource datasource;	
	
	private List<ShoppinglistProductMapping> shoppingListItems;
	private Shoppinglist currentShoppingList;
	private ShoppingListPersistence shoppingListPersistance;
	
	
	private ShoppingListModel(){
	}
	
	public static ShoppingListModel getInstance(Context context){
		if (instance == null){
			instance = new ShoppingListModel();	
			datasource = new ShoppinglistDataSource(context);
			datasource.open();
		}
		return instance;
	}
	
	public void moveShoppingListToHistory(){
		shoppingListPersistance = new ShoppingListPersistence();
		datasource.addAllToHistory();
		datasource.deleteAllShoppinglistProductMappings();
		shoppingListPersistance.updateShoppingList(datasource);
		shoppingListPersistance.addShoppingList(datasource);
	}
	
}
