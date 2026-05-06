package com.tp.products.sercive;


import com.tp.products.model.Product;
import com.tp.products.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product save(Product product) {
        return repo.save(product);
    }

    public Product getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}