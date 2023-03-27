package mx.com.vd_store.entity;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    //Construyendo la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    @Column (name = "name", nullable = false,length = 200)
    private String name;

    @Column (name = "brand", nullable = false,length = 200)
    private String brand;

    @Column (name = "type", nullable = false, length = 45)
    private String type;

    @Column (name = "description",nullable = false,length = 600)
    private String description;

    //Constructores
    public Product(){ }

    public Product(Integer idProduct,String name,String brand, String type, String description){
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.description = description;

    }

    //setters y getters
    public Integer getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "product [id" + idProduct + ", name=" + name + ", brand" + brand + ", type" + type + ", description" + description + "]";
    }

}
