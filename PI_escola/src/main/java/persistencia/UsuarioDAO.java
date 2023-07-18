
package persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import javax.swing.JOptionPane;



public class UsuarioDAO {

    public Usuario valida(String login, String senha) {
        Usuario user = null;

        EntityManager em = JPAUtil.getEntityManager();
        try {

            TypedQuery<Usuario> consulta = em.createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha ", Usuario.class);
            consulta.setParameter("login", login);
            consulta.setParameter("senha", senha);

            if (login.equals(consulta.getSingleResult().getLogin()) && senha.equals(consulta.getSingleResult().getSenha())) {
                user = consulta.getSingleResult();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de validação:\n" + e.getMessage());
        }

        return user;
    } 
}
