package atividade03uc09.model;
  import java.util.ArrayList;
  import java.util.List;

public class ListaConsulta {
    
    private static final List<Consulta> lista = new ArrayList<>();
    
    public static List<Consulta> listar() {
        return lista;
    }

    public static void adicionar(Consulta consulta) {
        lista.add(consulta);
    }
}
