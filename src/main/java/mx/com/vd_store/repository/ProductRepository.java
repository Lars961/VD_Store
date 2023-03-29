package mx.com.vd_store.repository;

import mx.com.vd_store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository  <Product, Integer> {

    List<Product> findByName (String name);
    List<Product> findByBrand (String brand);

    List<Product> findByType (String type);
}
