package bandsmanager.app;

import java.util.List;
import javax.persistence.EntityManager;

public class BusquedaDAO {


    public BusquedaDAO(){

    }

    public List<Busqueda> traerBusquedas(){

        EntityManager entityManager = Main.entityManagerFactory.createEntityManager();
        entityManager = Main.entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Busqueda> result = entityManager.createQuery("from Busqueda", Busqueda.class ).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return result;
    }
}
