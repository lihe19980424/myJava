package com.neusoft.neuedu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.neusoft.neuedu.common.HigherResponse;
import com.neusoft.neuedu.entity.Product;
import com.neusoft.neuedu.service.ProductService;

@RestController
@RequestMapping("/pro")
public class ProCon {
	
	@Autowired
	private ProductService productService;
	

	@RequestMapping("/list.do")
	public HigherResponse<PageInfo<Product>> getAllPro(HttpSession session,@RequestParam(defaultValue = "1",required = true)Integer pageNum,@RequestParam(defaultValue = "10",required = true)Integer pageSize){
		return productService.getAllProducts(session, pageNum, pageSize);
	}
	
}