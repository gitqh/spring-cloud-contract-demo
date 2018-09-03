package com.thoughtworks.contract.provider.service;

import com.thoughtworks.contract.provider.entity.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAll() {
        return Arrays.asList(
                new Product(1L, "苹果"),
                new Product(2L, "笔记本电脑"),
                new Product(3L, "电视机")
        );
    }

    public Long add(Product product) {
        return 3L;
    }
}
