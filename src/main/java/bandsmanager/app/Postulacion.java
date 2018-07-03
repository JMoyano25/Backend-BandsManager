package bandsmanager.app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Postulacion {
    private long id;
    private String instrument;
    private String genre;
    private int experience;
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

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrumento) {
        this.instrument = instrumento;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String generoMusical) {
        this.genre = generoMusical;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int aniosExperiencia) {
        this.experience = aniosExperiencia;
    }

    public long getId_musico() {
        return id_musico;
    }

    public void setId_musico(long id_musico) {
        this.id_musico = id_musico;
    }
}
