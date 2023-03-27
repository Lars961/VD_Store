package mx.com.vd_store.controller;
//clase controller debe importar la clase del objeto y la interfaz del objeto

import mx.com.vd_store.entity.Product;
import mx.com.vd_store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController indica que esta clase sera utilizada como controller del programa
@RequestMapping("/product")

@RestController
public class ProductController {

    //
    @Autowired
    private ProductService productService;

    @GetMapping("/vdProduct")
    public List<Product> listAllProduct() {

        return productService.listAllProducts();
    }

    @PostMapping("/product/new")
    public Product newProduct(@RequestBody Product product) {

        return productService.createProduct(product);
    }

    @GetMapping("/product/byIdProduct/{id}")
    @ResponseBody
    public String filterByIdProduct(@PathVariable String idProduct){

        return productService.getByIdProduct(Product, idProduct);
    }

}
