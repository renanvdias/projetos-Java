package br.com.podflix.podflix;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class PodcastsDAO {
     public void cadastrar(Podcasts d){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(d);
              em.getTransaction().commit();
          }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              JPAUtil.closeEtityManager();
          }
      }
      
      public List<Podcasts> listar(String filtroDescricao) {
        EntityManager em = JPAUtil.getEntityManager();
        List despesas = null;
        try {
            String textoQuery = "SELECT d FROM Podcasts d "
                    + " WHERE (:produtor is null OR d.produtor LIKE :produtor ) ";
            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("produtor", filtroDescricao.isEmpty() ? null : "%" + filtroDescricao + "%");

            despesas = consulta.getResultList();
        } finally {
            JPAUtil.closeEtityManager();
        }
        return despesas;
    }

}
