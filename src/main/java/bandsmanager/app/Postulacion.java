package bandsmanager.app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Postulacion {
    private long id;
    private String instrumento;
    private String generoMusical;
    private int aniosExperiencia;
    private long id_musico;

    public Postulacion(){

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

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public long getId_musico() {
        return id_musico;
    }

    public void setId_musico(long id_musico) {
        this.id_musico = id_musico;
    }
}
