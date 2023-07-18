public abstract class ContaCorrente {
    private double saldo;
    private int estado; // 1=conta ativa 2= conta inativa
    private int numConta;
    private int senha;

    public ContaCorrente(double saldo, int numConta, int senha) { //criando conta já ativa
        this.saldo = saldo;
        this.numConta = numConta;
        this.senha = senha;
        this.estado = 1;
    }

    public abstract boolean debitaValor(int senha, double valor);


    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
