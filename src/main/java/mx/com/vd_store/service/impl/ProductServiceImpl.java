package mx.com.vd_store.service.impl;

import mx.com.vd_store.entity.Product;
import mx.com.vd_store.repository.ProductRepository;
import mx.com.vd_store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service(value = "ProductService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private  ProductRepository productRepository;
    @Override
    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    //.orElse te regresa lo que le indiques si la indicacion principal no se cumple
    public Product getByIdProduct(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getByNameProduct(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> getByBrandProduct(String brand) {
        return productRepository.findByBrand(brand);
    }

    @Override
    public List<Product> getByTypeProduct(String type) {
        return productRepository.findByType(type);
    }

    @Override
    public Product modifyProduct(Product product, Integer id) {
        return null;
    }

    @Override
    public String deleteProduct(Integer id) {
        return null;
    }
}
