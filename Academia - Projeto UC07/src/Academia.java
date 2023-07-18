
import java.util.Scanner;

public class Academia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe 1 - Velocidade ou 2 - Resistência");
        byte opc = sc.nextByte();

        Modelo modelo = null;
        if (opc == 1)
        {
            modelo = new SugereVelocidade();
        }
        else{
            modelo = new SugereResistencia();
        }
        SugestaoExercicio sugestao = new SugestaoExercicio(modelo);
        sugestao.gerar();
        System.out.println("Musculação: " + sugestao.getExercicioMus().toString());
        System.out.println("Corrida: " + sugestao.getExercicioCor().toString());
  }
    
}
