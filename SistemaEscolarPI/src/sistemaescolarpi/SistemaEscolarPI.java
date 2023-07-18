package sistemaescolarpi;

import java.time.LocalDate;

public class SistemaEscolarPI {


    public static void main(String[] args) {
        SecretariaEscolar secretaria = new SecretariaEscolar();

        // Criação de alunos para o cadastro
        Aluno aluno1 = new Aluno("João", "12345678901", LocalDate.of(2005, 5, 10), "joao@example.com");
        Aluno aluno2 = new Aluno("Maria", "98765432101", LocalDate.of(2004, 9, 15), "maria@example.com");

        // Cadastro de alunos na secretaria
        secretaria.cadastrarAluno(aluno1);
        secretaria.cadastrarAluno(aluno2);

        // Listagem de alunos cadastrados
        System.out.println("Alunos cadastrados:");
        for (Aluno aluno : secretaria.listarAlunos()) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
            System.out.println("Contato: " + aluno.getContato());
            System.out.println("---------------------------------------");
        }
    }
    
}
