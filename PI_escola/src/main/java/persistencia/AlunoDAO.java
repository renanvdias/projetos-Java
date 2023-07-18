/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class AlunoDAO {
    
    public void cadastrar(Aluno obj) {

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
    public List<Aluno> listar(String filtroEntrada) {
        EntityManager em = JPAUtil.getEntityManager();
        List alunos = null;
        try {
            String textoQuery = "SELECT d FROM Aluno d "
                    + " WHERE (:nome is null OR d.nome LIKE :nome ) ";

            Query consulta = em.createQuery(textoQuery);

            consulta.setParameter("nome", filtroEntrada.isEmpty() ? null : "%" + filtroEntrada + "%");

            alunos = consulta.getResultList();
        } finally {
            JPAUtil.closeEtityManager();
        }
        return alunos;
    }
}
