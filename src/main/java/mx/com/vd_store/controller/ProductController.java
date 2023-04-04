package mx.com.vd_store.controller;
//clase controller debe importar la clase del objeto y la interfaz del objeto

import mx.com.vd_store.entity.Product;
import mx.com.vd_store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController indica que esta clase sera utilizada como controller del programa
@RequestMapping("/product")
@CrossOrigin
@RestController
public class ProductController {

    //
    @Autowired
    //@Qualifier Sirve para seleccionar tu clase de implementacion de servicio ** debe incluir tu clase implementacion la notacion @Service y el nombre designado para dicha implementacion
    @Qualifier("ProductService")
    private ProductService productService;

    @GetMapping("/vdProduct")
    public ResponseEntity<List<Product>>listAllProduct() {

        return ResponseEntity.ok(productService.listAllProducts());
    }


    //Crear el filtro para la busqueda de productos segun su tipo
    @GetMapping("/vdProduct/{filter}")
    public ResponseEntity<List<Product>>listAllProductByFilter(@PathVariable(name = "filter") String filter) {

        return ResponseEntity.ok(productService.listAllProducts());
    }

    @PostMapping("/product/new")
    public ResponseEntity<Product> newProduct(@RequestBody Product product) {

        Product productResponse = productService.createProduct(product);
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
        //return ResponseEntity.ok(productService.createProduct(product));
    }

    @GetMapping("/product/byIdProduct/{productId}")
    @ResponseBody

    public Product filterByIdProduct(@PathVariable(name = "productId") Integer productId){

        return productService.getByIdProduct(productId);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable(name = "productId")Integer productId){
        Product productResponse = productService.modifyProduct(product, productId);
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
    }



    @DeleteMapping("/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable(name = "productId")Integer productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>("Deleted successfully", HttpStatus.OK);
    }



}
