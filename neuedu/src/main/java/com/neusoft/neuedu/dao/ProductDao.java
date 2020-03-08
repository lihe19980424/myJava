package com.neusoft.neuedu.dao;

import java.util.List;

import com.neusoft.neuedu.entity.Product;

/**
 * 商品接口
 * @author Neuedu
 *
 */
public interface ProductDao {

	List<Product> queryAllPro();
	
}