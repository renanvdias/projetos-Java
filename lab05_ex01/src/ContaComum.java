public class ContaComum extends ContaCorrente{
    private double limite;

    public ContaComum(double saldo, int numConta, int senha) {
        super(saldo, numConta, senha);
        this.limite = 0;
    }

    public boolean debitaValor (int senha, double valor)
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

        if(getSaldo() == 0)
        {
            setEstado(2);
        }

        return true;
    }

}
