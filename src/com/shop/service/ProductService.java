package com.shop.service;

import java.util.List;

import com.shop.entity.Product;

public interface ProductService {
	// �������ȵ���Ʒ10��
    public List<Product> findHot();

    // �������µ���Ʒ10��
    public List<Product> findNew();
    
    // ������Ʒ��pid��ֵ��ѯ��Ʒ
    public Product findByPid(Integer pid);
}
