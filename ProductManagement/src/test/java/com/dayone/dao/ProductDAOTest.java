package com.dayone.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.dayone.model.Product;

public class ProductDAOTest extends ProductDAO {

	@Test
	public void test() {
		Product product=new Product();
		product.setProd_name("Watch");
		product.setPrice(500);
		product.setProd_details("MadeIndia");
		product.setWarranty("1year");
		ProductDAO dao=new ProductDAO();
		dao.add(product);
		List<Product> list = dao.show();
		for(Product pro:list)
			System.out.println(pro);
	}

}
