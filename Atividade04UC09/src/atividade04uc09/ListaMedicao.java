package atividade04uc09;
import java.util.ArrayList;
  import java.util.List;

public class ListaMedicao {
    private static final List<Medicao> lista = new ArrayList<>();
    
    public static List<Medicao> listar() {
        return lista;
    }

    public static void adicionar(Medicao medicao) {
        lista.add(medicao);
    }
}
