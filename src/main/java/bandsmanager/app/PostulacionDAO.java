package bandsmanager.app;



import javax.persistence.EntityManager;
import java.util.List;

public class PostulacionDAO {

    public PostulacionDAO(){

    }

    public List<Postulacion> traerPostulaciones(){

        EntityManager entityManager = Main.entityManagerFactory.createEntityManager();
        entityManager = Main.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Postulacion> result = entityManager.createQuery("from Postulacion", Postulacion.class ).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return result;
    }

}
