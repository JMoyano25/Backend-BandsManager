package bandsmanager.app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

public class Main {
    protected static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "bandsmanager.app.jpa" );;

    public static void main(String[] args) {
        Matcheador match=new Matcheador();
        match.realizadorMatcheos();
    }

}
