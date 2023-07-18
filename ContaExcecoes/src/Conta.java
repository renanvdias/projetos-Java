import java.util.Random;

public class Conta {
    private int number;
    Random random = new Random();
    private String nome;
    private double saldo;
    private double limite;

    public Conta(String nome, double limite) {
        this.number = random.nextInt(900)+100;
        this.nome = nome;
        this.saldo = 0;
        this.limite = limite;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar(double valor)
    {
        this.saldo += valor;
    }

    public void retirar(double valor) throws ExcecaoTransacao
    {
        if(getSaldo() < valor)
        {
            throw new ExcecaoTransacao("Não foi possível sacar valor, saldo insuficiente");
        }else if(getLimite() < valor) {
            throw new ExcecaoTransacao("Não foi possível sacar valor, limite de saque atingido");
        }else
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "number=" + number +
                ", nome='" + getNome() + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                "}\n";
    }
}
