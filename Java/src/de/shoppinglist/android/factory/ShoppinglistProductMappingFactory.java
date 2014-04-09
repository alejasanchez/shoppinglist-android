package de.shoppinglist.android.factory;

import de.shoppinglist.android.bean.FavoriteProductMapping;
import de.shoppinglist.android.bean.ShoppinglistProductMapping;

public class ShoppinglistProductMappingFactory extends AbstractListFactory{
	private static ShoppinglistProductMappingFactory instance = null;
	private ShoppinglistProductMappingFactory()
	{
		listProdMapping = new ShoppinglistProductMapping();
	}
	public static ShoppinglistProductMappingFactory getInstance(){
		if(instance == null) instance = new ShoppinglistProductMappingFactory();
		return instance;
	}
	
	@Override
	public FavoriteProductMapping createFavoriteProductMapping() {
		return null;
	}

	@Override
	public ShoppinglistProductMapping createShoppinglistProductMapping() {
		
		return new ShoppinglistProductMapping();
	}

}
