package mx.com.vd_store.service;

import mx.com.vd_store.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> listAllProducts();
    public Product createProduct(Product product);
    public List<Product> getByIdProduct(Integer id);
    public List<Product> getByNameProduct(String name);
    public List<Product>getByBrandProduct(String brand);
    public List<Product>getByTypeProduct(String type);
    public Product modifyProduct(Product product, Integer id);
    public String deleteProduct(Integer id);
}
