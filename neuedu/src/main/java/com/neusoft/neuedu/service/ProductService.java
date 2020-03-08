package com.neusoft.neuedu.service;

import javax.servlet.http.HttpSession;

import com.github.pagehelper.PageInfo;
import com.neusoft.neuedu.common.HigherResponse;
import com.neusoft.neuedu.entity.Product;

public interface ProductService {

	HigherResponse<PageInfo<Product>> getAllProducts(HttpSession session,Integer pageNum,Integer pageSize);
	
}