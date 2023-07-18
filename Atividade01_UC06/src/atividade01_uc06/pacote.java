/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01_uc06;

/**
 *
 * @author User
 */
public class pacote {
    String destino;
    int dias;
    public transporte trans;
    public hospedagem hosp;
    

public float totalHospedagem (float valor_Diaria, int dias)
{
    float valor_hospedagem;
    valor_hospedagem = valor_Diaria * dias;
    return valor_hospedagem;
}


public float valorLucro (float margem, float taxa)
{
    float valor_lucro;
    valor_lucro = taxa * ((margem/100) + 1);
    return valor_lucro;
}

public float valorTotal (float valor_hospedagem, float valor_transporte, float valor_lucro)
{
    float valor_total;
    valor_total = valor_hospedagem + valor_transporte + valor_lucro;
    return valor_total;
}

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public transporte getTrans() {
        return trans;
    }

    public void setTrans(transporte trans) {
        this.trans = trans;
    }

    public hospedagem getHosp() {
        return hosp;
    }

    public void setHosp(hospedagem hosp) {
        this.hosp = hosp;
    }
}
