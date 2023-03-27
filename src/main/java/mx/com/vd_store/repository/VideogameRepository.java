package mx.com.vd_store.repository;

import mx.com.vd_store.entity.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameRepository extends JpaRepository <Videogame, Integer>{
}
