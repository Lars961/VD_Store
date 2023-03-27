package mx.com.vd_store.repository;

import mx.com.vd_store.entity.Console;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository <nombre del objeto, tipo de dato id>
@Repository
public interface ConsoleRepository extends JpaRepository <Console, Integer>{
}
