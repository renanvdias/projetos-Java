package atividade03;

public class Horistas extends Funcionarios {
    private double horas;
    private double valor_hora;
    private double total_horista;

    
    public Horistas (String nome, String cpf, String endereco, String telefone, String setor, double horas, double valor_hora) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
        this.horas = horas;
        this.valor_hora = valor_hora;
    }

    
    @Override
    public void mostrarDados()
    {
        System.out.println("===DADOS DO FUNCIONÁRIO HORISTA===");
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
        this.total_horista = (this.horas * this.valor_hora * rendimento);
        return this.total_horista;
    }
    
    @Override
    public double mostrarSalario ()
    {
        this.setTotal_horista(this.getValor_hora() * this.getHoras());
        return this.getTotal_horista();
    }
    
        public double getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public double getTotal_horista() {
        return total_horista;
    }

    public void setTotal_horista(double total_horista) {
        this.total_horista = total_horista;
    }
    
}
