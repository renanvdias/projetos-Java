
package atividade01_uc06;

public class venda {
    String nome_cliente, forma_pagamento;
    pacote viagem;
    public void conversao (float valor_total, float cotacao)
    {
        float valor_real;
        valor_real = valor_total * cotacao;
        System.out.println("O valor convertido para reais é de R$ " + valor_real);
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public pacote getViagem() {
        return viagem;
    }

    public void setViagem(pacote viagem) {
        this.viagem = viagem;
    }
    
}
