package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Supplier;

public interface ProductDAO {
	
	public boolean save(Supplier supplier);
	public boolean delete(Supplier supplier);
	public boolean update (Supplier supplier);
	
	public Supplier get(String id);
	public List<Supplier>    list();

}
