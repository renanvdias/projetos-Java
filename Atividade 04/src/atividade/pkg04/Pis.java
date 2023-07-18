package atividade.pkg04;

public class Pis extends Pagamentos implements Calculo{
   protected Double credito;
   protected Double debito; 

//CONSTRUTOR--------------------
    public Pis(){
        
    }
    public Pis(Double credito,Double debito){
        this.credito = credito;
        this.debito = debito;

    } 
//GET É SET----------------------
    public Double getCredito(){
        return credito;
    }
    public void setCredito(Double credito){
        this.credito = credito;
    }

    public Double getDebito(){
        return debito;
    }
    public void setDebito(Double debito){
        this.debito = debito;
    }

//METODOS ABSTRACT--------------------------

// Débito R$ 30000,00; Crédito R$
// 16000,00; (30000 - 16000) * 1,65% = 14000
// * 1,65% = R$ 235.


@Override
    public Double calculoImposto(){
        double total = debito - credito;
        total *= 1.65 / 100;
        return total;
    }
@Override
    public void descricao(){
        System.out.println("PIS: ");
    }   

}