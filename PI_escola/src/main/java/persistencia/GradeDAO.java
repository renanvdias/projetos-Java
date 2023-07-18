
package persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class GradeDAO {
    
    public void cadastrar(Grade obj) {

        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    // func listar
    public List<Grade> listar(String filtroEntrada) {
        EntityManager em = JPAUtil.getEntityManager();
        List grades = null;
        try {
            String textoQuery = "SELECT d FROM Grade d "
                    + " WHERE (:disciplina is null OR d.disciplina LIKE :disciplina ) ";

            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("disciplina", filtroEntrada.isEmpty() ? null : "%" + filtroEntrada + "%");

            grades = consulta.getResultList();
        } finally {
            JPAUtil.closeEtityManager();
        }
        return grades;
    }
}
