package atividade.pkg04;

public class Empresa {
   protected String nomeEmpresa; 

//CONTRUTOR--------------------------------
    public Empresa(){}


    public Empresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }
 
//GET É SET--------------------------------
    public String getNomeEmpresa(){
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
        
    }
}
