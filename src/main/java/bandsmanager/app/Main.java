package bandsmanager.app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    protected static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "bandsmanager.app.jpa" );;

    public static void main(String[] args) {
        NotificacionService noti = new NotificacionService();
        noti.realizadorMatcheos();
    }

}
