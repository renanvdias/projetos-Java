public class Main {
    public static void main(String[] args) {
        ContaCorrente [] contas = new ContaCorrente[3];
        contas[0] = new ContaEspecial(100, 01, 1515, 100);
        contas[1] = new ContaComum(100, 02, 1414);
        contas[2] = new ContaEspecial(100, 03, 1717, 0);
        for (int i = 0; i < contas.length; i++)
        {
            if (contas[i] instanceof ContaEspecial)
                if (((ContaEspecial) contas[i]).getLimite() == 0)
                {
                    contas[i] = new ContaComum (contas[i].getSaldo(), contas[i].getNumConta(), contas[i].getSenha());
                }
        }
    }
}