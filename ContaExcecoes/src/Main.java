import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<Conta> contas = new ArrayList<Conta>();
            System.out.println("BEM VINDO AO PROGRAMA");
            System.out.println("Quantas contas deseja cadastrar? ");
            int c = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < c; i++) {
                System.out.println("Escreva seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Escreva o limite de saque na conta desejado");
                double limite = sc.nextDouble();
                sc.nextLine();
                contas.add(i, new Conta(nome, limite));
            }
            System.out.println("Contas cadastradas: ");
            System.out.println(Arrays.toString(contas.toArray()));
            System.out.println("Quanto deseja depositar?");
            double deposito = sc.nextDouble();
            contas.get(0).depositar(deposito);
            System.out.println("Saldo da conta: " + contas.get(0).getSaldo());
            System.out.println("Quanto deseja retirar?");
            double retirada = sc.nextDouble();
            contas.get(0).retirar(retirada);
            System.out.println("Saldo da conta: " + contas.get(0).getSaldo());
        }catch (ExcecaoTransacao e ){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}