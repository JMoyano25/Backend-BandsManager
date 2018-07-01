package bandsmanager.app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

public class Main {
    protected static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "bandsmanager.app.jpa" );;

    public static void main(String[] args) {
        BusquedaDAO prueba = new BusquedaDAO();
        PostulacionDAO prueba2= new PostulacionDAO();
        NotificacionDAO prueba3 = new NotificacionDAO();
        List<Busqueda> pru = prueba.traerBusquedas();
        List<Postulacion> pru2 = prueba2.traerPostulaciones();
        Notificacion not= new Notificacion();
        not.setDescripcion("HOLA");
        not.setMostrada(false);
        prueba3.guardarNotificacion(not);
        System.out.print(pru.get(0));
    }

}
