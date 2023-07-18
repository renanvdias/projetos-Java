package atividade03;
import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Funcionarios[] empregados = new Funcionarios[10];
        String opcao = "x";
        System.out.println("==Bem-vindos a Empresa XYZ!==");
        System.out.println("Vamos preencher os funcionários da empresa");
        int i = 0;
        do {
            String tipo;
            System.out.println("Selecione o tipo de contrato do funcionário, digite: assalariado ou horista");
            tipo = entrada.next();
            entrada.nextLine();

            if (i == 10) {
                System.out.println(" Número máximo atingido! ");

                break;
            } else if ("assalariado".equals(tipo)) {

                System.out.println("Informe o nome e o cpf:");
                String nome = entrada.nextLine();
                String cpf = entrada.nextLine();

                System.out.println("Informe o endereço e o telefone:");
                String endereco = entrada.nextLine();
                String telefone = entrada.nextLine();

                System.out.println("informe o setor em que trabalha e salario:");
                String setor = entrada.nextLine();
                double salario = entrada.nextDouble();

                empregados[i] = new Assalariados (nome, cpf, endereco, telefone, setor, salario);
                empregados[i].mostrarDados();
                System.out.println("Salario: " + empregados[i].mostrarSalario());
                i++;
            } else if ("horista".equals(tipo)) {

                System.out.println("informe o nome e o cpf:");
                String nome = entrada.nextLine();
                String cpf = entrada.nextLine();

                System.out.println("informe o endereço e o telefone:");
                String endereco = entrada.nextLine();
                String telefone = entrada.nextLine();

                System.out.println("informe o setor em que trabalha:");
                String setor = entrada.nextLine();

                System.out.println("informe a quantidade de horas trabalhadas e o valor da hora");
                double horaTrabalhada = entrada.nextDouble();
                double valorHora = entrada.nextDouble();

                empregados[i] = new Horistas(nome, cpf, endereco, telefone, setor, horaTrabalhada, valorHora);
                empregados[i].mostrarDados();
                System.out.println("Salário: " + empregados[i].mostrarSalario());
                i++;
            }
            System.out.println("");
            System.out.println(" Gostaria de inserir algum outro funcionário? (Digite x se deseja sair) e s se deseja continuar");
            opcao = entrada.next();
            entrada.nextLine();

        } while (!"x".equals(opcao));
        
        System.out.println("==Vamos realizar o aumento para todos os funcionários==");
        for (i = 0; i < 10; i++) {

            if (empregados[i] == null) {
                break;
            } else {
                empregados[i].mostrarDados();
                System.out.println("Salário atual: " + String.format("%.3f", empregados[i].mostrarSalario()));
                System.out.println("");
            }
        }
        System.out.println("Informe a porcentagem de aumento para aplicar:");
        double aumento = entrada.nextInt();
        aumento = aumento/100.0;
        aumento = aumento +1;
        for (i = 0; i < 10; i++) {
            if (empregados[i] == null) {
                break;
            } else {

                System.out.println("Funcionário: " + empregados[i].getNome());
                System.out.println("Salário após  o aumento: " + empregados[i].calcularSalario(aumento));
                System.out.println("");
            }
        }

    }

}
        
      
    
