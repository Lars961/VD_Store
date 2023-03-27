package mx.com.vd_store.repository;

import mx.com.vd_store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository  <Product, Integer> {
}
