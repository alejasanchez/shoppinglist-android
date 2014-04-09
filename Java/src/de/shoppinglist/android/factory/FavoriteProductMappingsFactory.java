package de.shoppinglist.android.factory;

import de.shoppinglist.android.bean.FavoriteProductMapping;
import de.shoppinglist.android.bean.ShoppinglistProductMapping;

public class FavoriteProductMappingsFactory  extends AbstractListFactory
{
	private static FavoriteProductMappingsFactory instance = null;
	private FavoriteProductMappingsFactory()
	{
		listProdMapping = new FavoriteProductMapping();
	}
	public static FavoriteProductMappingsFactory getInstance(){
		if(instance == null) instance = new FavoriteProductMappingsFactory();
		return instance;
	}
	
	@Override
	public FavoriteProductMapping createFavoriteProductMapping() 
	{
		
		return new FavoriteProductMapping();
	}

	@Override
	public ShoppinglistProductMapping createShoppinglistProductMapping() 
	{
		return null;
	}

}
