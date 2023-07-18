
package persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class ProfessorDAO {
    public void cadastrar(Professor obj) {

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
    public List<Professor> listar(String filtroEntrada) {
        EntityManager em = JPAUtil.getEntityManager();
        List professores = null;
        try {
            String textoQuery = "SELECT d FROM Professor d "
                    + " WHERE (:nome is null OR d.nome LIKE :nome ) ";

            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("nome", filtroEntrada.isEmpty() ? null : "%" + filtroEntrada + "%");

            professores = consulta.getResultList();
        } finally {
            JPAUtil.closeEtityManager();
        }
        return professores;
    }
}
