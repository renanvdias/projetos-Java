package atividade03;

public class Assalariados extends Funcionarios {
    private double salario;
    private double total;

    public Assalariados(String nome, String cpf, String endereco, String telefone, String setor, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    @Override
    public void mostrarDados()
    {
        System.out.println("===DADOS DO FUNCIONÁRIO ASSALARIADO===");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Setor: " + this.setor);
        System.out.println("===============");
    }
    
    @Override
    public double calcularSalario(double rendimento)
    {
        this.setTotal(rendimento* this.getSalario());
        return this.getTotal();
    }
    
    @Override
    public double mostrarSalario()
    {
        return this.getSalario();
    }
}
