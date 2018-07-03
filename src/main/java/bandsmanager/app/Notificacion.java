package bandsmanager.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Notificacion {

    private long id;
    private String descripcion;
    private boolean mostrada;
    private long id_musico;
    private long id_banda;

    public Notificacion(){

    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getId_musico() {
        return id_musico;
    }

    public void setId_musico(long id_musico) {
        this.id_musico = id_musico;
    }

    public long getId_banda() {
        return id_banda;
    }

    public void setId_banda(long id_banda) {
        this.id_banda = id_banda;
    }
}
