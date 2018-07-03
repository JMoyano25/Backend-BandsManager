package bandsmanager.app;

import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class Busqueda {
    private long id;
    private String instrumento;
    private int aniosExperiencia;
    private String generoMusical;
    private long id_banda;


    public Busqueda() {

    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }


    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public long getId_banda() {
        return id_banda;
    }

    public void setId_banda(long id_banda) {
        this.id_banda = id_banda;
    }
}
