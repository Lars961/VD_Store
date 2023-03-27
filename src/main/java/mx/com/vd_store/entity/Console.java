package mx.com.vd_store.entity;

import javax.persistence.*;

@Entity
@Table (name = "Console")
public class Console {
    //contruyendo tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConsole;

    @Column (name = "name", nullable = false,length = 200)
    private String nameConsole;
    @Column (name = "brand", nullable = false,length = 200)
    private String brandConsole;

    @Column (name = "origin", nullable = false,length = 45)
    private String origin;

    @Column (name = "review", nullable = false,length = 600)
    private String reviewConsole;

    //constructores
    public Console (){ }

    public Console(Integer idConsole, String nameConsole, String brandConsole, String origin, String review) {

        this.nameConsole = nameConsole;
        this.brandConsole = brandConsole;
        this.origin = origin;
        this.reviewConsole = review;

    }

    //Getters y setters


    public Integer getIdConsole() {
        return idConsole;
    }

    public void setIdConsole(Integer idConsole) {
        this.idConsole = idConsole;
    }

    public String getBrandConsole() {
        return brandConsole;
    }

    public void setBrandConsole(String brandConsole) {
        this.brandConsole = brandConsole;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getReview() {
        return reviewConsole;
    }

    public void setReview(String review) {
        this.reviewConsole = review;
    }

    @Override
    public String toString(){
        return "console [ id" + idConsole + "brand" + brandConsole + "origin" + origin + "review" + reviewConsole + "]";
    }
}
