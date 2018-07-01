package bandsmanager.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Notificacion {

    private long id;
    private String descripcion;
    private boolean mostrada;

    public Notificacion(){

    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isMostrada() {
        return mostrada;
    }

    public void setMostrada(boolean mostrada) {
        this.mostrada = mostrada;
    }
}
