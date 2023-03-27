package mx.com.vd_store.entity;

import javax.persistence.*;

//declarando que es una tabla con el nombre videogame
@Entity
@Table (name = "Videogame")
public class Videogame {

    //construyendo tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVideogame;

    @Column (name = "platform", nullable = false,length = 200)
    private String platformVideogame;

    @Column (name = "brand", nullable = false,length = 200)
    private String brandVideogame;

    @Column (name = "review", nullable = false,length = 600)
    private String reviewVideogame;

    @Column (name = "ranking", nullable = false,length = 600)
    private String rankingVideogame;

    //constructores
    public Videogame() { }

    public Videogame(Integer idVideogame, String platformVideogame, String brandVideogame, String reviewVideogame, String rankingVideogame) {

        this.platformVideogame = platformVideogame;
        this.brandVideogame = brandVideogame;
        this.reviewVideogame = reviewVideogame;
        this.rankingVideogame = rankingVideogame;
    }

    //getters y setters


    public Integer getIdVideogame() {
        return idVideogame;
    }

    public void setIdVideogame(Integer idVideogame) {
        this.idVideogame = idVideogame;
    }

    public String getPlatform() {
        return platformVideogame;
    }

    public void setPlatform(String platform) {
        this.platformVideogame = platform;
    }

    public String getBrandVideogame() {
        return brandVideogame;
    }

    public void setBrandVideogame(String brandVideogame) {
        this.brandVideogame = brandVideogame;
    }

    public String getReviewVideogame() {
        return reviewVideogame;
    }

    public void setReviewVideogame(String reviewVideogame) {
        this.reviewVideogame = reviewVideogame;
    }

    public String getRankingVideogame() {
        return rankingVideogame;
    }

    public void setRankingVideogame(String rankingVideogame) {
        this.rankingVideogame = rankingVideogame;
    }

    @Override
    public String toString(){
        return "videogame [id" + idVideogame + "platform" + platformVideogame + "brand" + brandVideogame + "review" + reviewVideogame + "ranking" + rankingVideogame + "]";
    }
}
