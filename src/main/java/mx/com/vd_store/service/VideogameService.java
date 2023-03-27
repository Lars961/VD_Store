package mx.com.vd_store.service;


import mx.com.vd_store.entity.Videogame;

import java.util.List;

public interface VideogameService {

    public List<Videogame> listAllVideogames();
    public Videogame createVideogame(Videogame videogame);
    public List<Videogame> getByIdVideogame(Integer idVideogame);
    public List<Videogame> getByPlatform(String platormVideogame);
    public List<Videogame> getByBrand(String brandVideogame);
    public List<Videogame> getByRanking(String rankingVideogame);

}
