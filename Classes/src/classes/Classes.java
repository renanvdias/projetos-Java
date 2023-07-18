
package classes;

public class Classes {

    public static void main(String[] args) {
        
    Aluno aluno1 = new Aluno();
    Aluno aluno2 = new Aluno();
    Aluno aluno3 = new Aluno();
    /*Aqui são instanciados três objetos da mesma classe aluno, e agora é possível decidir qual atributo se quer utilizar para cada um deles */

    aluno1.nome="Celso Medeiros";
    aluno1.matricula=1;
    aluno1.cpf="00134578090";

    aluno2.nome="Camila Alves";
    aluno2.matricula=2;

    aluno3.cpf="0019007890";

    /*Criados os objetos, deve-se mostrar os resultados na tela */

    System.out.println("Mostrar Alunos:"); /*o comando \n serve para pular uma linha após o mostrar alunos */
    System.out.println("Nome do aluno1: " + aluno1.nome);
    System.out.println("Matrícula do aluno1: " + aluno1.matricula);
    System.out.println("CPF do aluno1: " + aluno1.cpf);
    System.out.println("Nome do aluno2: " + aluno2.nome);
    System.out.println("Matrícula do aluno2: " + aluno2.matricula);
    System.out.println("CPF do aluno3: " + aluno3.cpf);
  
    }
    
}
