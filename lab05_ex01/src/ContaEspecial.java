public class ContaEspecial extends ContaCorrente{
    private double limite;

    public ContaEspecial(double saldo, int numConta, int senha, double limite) {
        super(saldo, numConta, senha);
        this.limite = limite;
    }

    public boolean debitaValor(int senha, double valor)
    {
        if (senha != getSenha())
            return false;

        if (getEstado() != 1)
            return false;

        if (valor <= 0)
            return false;

        if (valor > getSaldo())
            return false;

        setSaldo(getSaldo()- valor);

        return true;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
