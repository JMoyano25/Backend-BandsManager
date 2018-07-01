package bandsmanager.app;

import javax.persistence.EntityManager;

public class NotificacionDAO {

    public NotificacionDAO(){

    }

    public void guardarNotificacion(Notificacion noti){
        EntityManager entityManager = Main.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(noti);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
