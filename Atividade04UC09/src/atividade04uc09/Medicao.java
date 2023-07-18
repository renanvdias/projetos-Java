package atividade04uc09;

public class Medicao {
    private String data;
    private String hora;
    private String pressao_s;
    private String pressao_d;
    private String estresse;

    public Medicao(String data, String hora, String pressao_s, String pressao_d, String estresse) {
        this.data = data;
        this.hora = hora;
        this.pressao_s = pressao_s;
        this.pressao_d = pressao_d;
        this.estresse = estresse;
    }
    
    public Medicao(){
    }
    
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPressao_s() {
        return pressao_s;
    }

    public void setPressao_s(String pressao_s) {
        this.pressao_s = pressao_s;
    }

    public String getPressao_d() {
        return pressao_d;
    }

    public void setPressao_d(String pressao_d) {
        this.pressao_d = pressao_d;
    }

    public String getEstresse() {
        return estresse;
    }

    public void setEstresse(String estresse) {
        this.estresse = estresse;
    }
    
}
