package bandsmanager.app;

import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class Busqueda {
    private long id;
    private String instrument;
    private int experience;
    private String genre;
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

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrumento) {
        this.instrument = instrumento;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int aniosExperiencia) {
        this.experience = aniosExperiencia;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String generoMusical) {
        this.genre = generoMusical;
    }

    public long getId_banda() {
        return id_banda;
    }

    public void setId_banda(long id_banda) {
        this.id_banda = id_banda;
    }
}
