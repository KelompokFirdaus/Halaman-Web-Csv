package com.web.service;


import javax.transaction.Transactional;

import com.web.entity.Product;
import com.web.repo.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public Iterable<Product> findAll(){
        return repo.findAll();
    }

}
