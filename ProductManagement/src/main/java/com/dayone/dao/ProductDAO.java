package com.dayone.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dayone.model.Product;
import com.dayone.util.ConnectionUtil;

public class ProductDAO {
	private JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
	public void add(Product model)
	{
		String query="insert into product_details(prod_name,price,prod_details,warranty) values (?,?,?,?)";
		Object[] params={model.getProd_name(),model.getPrice(),model.getProd_details(),model.getWarranty()};
		int rows=jdbcTemplate.update(query,params);
	}
	public List<Product> show()
	{
		String query="select prod_name,price,prod_details,warranty from product_details";
		List<Product> productList=jdbcTemplate.query(query, (rs,rowNo)->
		{
		Product product = new Product();
		product.setProd_name(rs.getString("prod_name"));
		product.setPrice(rs.getFloat("price"));
		product.setProd_details(rs.getString("prod_details"));
		product.setWarranty(rs.getString("warranty"));
		return product;
	});
return productList;
	}
}
