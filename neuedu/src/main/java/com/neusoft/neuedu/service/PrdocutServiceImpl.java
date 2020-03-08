package com.neusoft.neuedu.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.neuedu.common.HigherResponse;
import com.neusoft.neuedu.dao.ProductDao;
import com.neusoft.neuedu.entity.Product;

@Service
public class PrdocutServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Override
	public HigherResponse<PageInfo<Product>> getAllProducts(HttpSession session,Integer pageNum,Integer pageSize) {
		Object attribute = session.getAttribute("user");
		if(null == attribute) {
			return HigherResponse.getFailedRespon("未登录,请重新登录");
		}
		PageHelper.startPage(pageNum, pageSize);
		List<Product> queryAllPro = productDao.queryAllPro();
		if(null == queryAllPro) {
			return HigherResponse.getFailedRespon("商品列表为空");
		}
		PageInfo<Product> pageInfo = new PageInfo<Product>(queryAllPro);
		return HigherResponse.getSuccessRespon(pageInfo);
	}
}