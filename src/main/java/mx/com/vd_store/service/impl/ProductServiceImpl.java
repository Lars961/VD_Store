package mx.com.vd_store.service.impl;

import mx.com.vd_store.entity.Product;
import mx.com.vd_store.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ProductService")
public class ProductServiceImpl implements ProductService {


    @Override
    public List<Product> listAllProducts() {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product getByIdProduct(Integer id) {
        return null;
    }

    @Override
    public List<Product> getByNameProduct(String name) {
        return null;
    }

    @Override
    public List<Product> getByBrandProduct(String brand) {
        return null;
    }

    @Override
    public List<Product> getByTypeProduct(String type) {
        return null;
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
