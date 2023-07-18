package appacessbd;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Conexao {
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
     public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cenaflix","root", "");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }
     
       public int salvar(Filmes filmes){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO filmes VALUES(?,?,?,?)");
            st.setInt(1,filmes.getId());
            st.setString(2,filmes.getNome());
            st.setDate(3, filmes.getData());
            st.setString(4, filmes.getCategoria());
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
     
      public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            //pode-se deixar vazio para evitar uma mensagem de erro desnecessária ao usuário
        }
    }
      
      public Filmes consultar (String matricula){
         
        try {
            Filmes funcionario = new Filmes();
            st = conn.prepareStatement("SELECT * from filmes WHERE nome = ?");
            st.setString(1, matricula);
            rs = st.executeQuery();
            //verificar se a consulta encontrou o funcionário com a matrícula informada
            if(rs.next()){ // se encontrou o funcionário, vamos carregar os dados
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setData(rs.getDate("datalancamento"));
                funcionario.setCategoria(rs.getString("categoria"));
                return funcionario;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
      
       public boolean excluir(String matricula){
        try {
            st = conn.prepareStatement("DELETE FROM filmes WHERE nome = ?");
            st.setString(1,matricula);
            st.executeUpdate();
            return true;
            } catch (SQLException ex) {
                System.out.println("Erro ao conectar: " + ex.getMessage());
                return false;
        }
    }
      
        public int atualizar(Filmes func){
        int status;
        try {
            st = conn.prepareStatement("UPDATE filmes SET nome = ?, datalancamento = ?, categoria = ? where id = ?");
            st.setString(1,func.getNome());
            st.setDate(2,func.getData());
            st.setString(3, func.getCategoria());
            st.setInt(4,func.getId());
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }
       
     public List<Filmes> listagem(String filtro) {

        String sql = "select * from filmes";

        if (!filtro.isEmpty()) {
            sql = sql + " where nome like ?";
        }

        try {
            st = conn.prepareStatement(sql);

            if (!filtro.isEmpty()) {
                st.setString(1, "%" + filtro + "%");
            }

            rs = st.executeQuery();
            List<Filmes> lista = new ArrayList<>();

            while (rs.next()) {
                Filmes filmes = new Filmes();
                filmes.setId(rs.getInt("id"));
                filmes.setNome(rs.getString("nome"));
                filmes.setData(rs.getDate("datalancamento"));
                filmes.setCategoria(rs.getString("categoria"));
                lista.add(filmes);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
     }
    }
