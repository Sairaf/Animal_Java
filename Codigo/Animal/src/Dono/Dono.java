/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dono;

/**
 *
 * @author ABGerson
 */
public class Dono {
    private String nomeDono;
    private String qualidadeTratamento;
    private int numeroAnimais;

    public Dono(String nomeDono, String qualidadeTratamento, int numeroAnimais) {
        this.nomeDono = nomeDono;
        this.qualidadeTratamento = qualidadeTratamento;
        this.numeroAnimais = numeroAnimais;
    }

      public Dono() {
        this.nomeDono = "Desconhecido";
        this.qualidadeTratamento = "Desconhecido";
        this.numeroAnimais = 0;
    } 

      
    
    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        if(!nomeDono.isEmpty()){
         this.nomeDono = nomeDono;
        }else{
         this.nomeDono = "nao declarado";   
        }
    }

    public String getQualidadeTratamento() {
        return qualidadeTratamento;
    }

    public void setQualidadeTratamento(String qualidadeTratamento) {
        if(qualidadeTratamento.isEmpty()){
          this.qualidadeTratamento = qualidadeTratamento;
        }else{
          this.qualidadeTratamento = "Desconhecida"; 
        }    
        
    }

    public int getNumeroAnimais() {
        return numeroAnimais;
    }

    public void setNumeroAnimais(int numeroAnimais) {
        if(numeroAnimais > 0){
         this.numeroAnimais = numeroAnimais;   
        }else{
         this.numeroAnimais = 1;               
        }
        
    }
    
    public String Verificar_Qualidade_Tratamento(int qualidade){
        String aux = null;
      if(qualidade == 0)           {
          aux = "Qualidade horrivel";
      }else if(qualidade > 0&& qualidade <= 5){
         aux = "Qualidade insuficiente";   
      }else if(qualidade > 5&& qualidade <= 7){
         aux = "Qualidade regular";   
      }else if(qualidade > 7&& qualidade <= 9){
         aux = "Qualidade boa";   
      }else if(qualidade > 10){
         aux = "Qualidade excelente";   
     }
       return aux;
    }
    
    @Override
    public String toString(){
      String s;      
      if(this.numeroAnimais  <= 1){
      s = "\n=========================\n\nNome do Dono: " + this.nomeDono + "\nPossui: "+ this.numeroAnimais + " animal: \n";
          
      }else {
      s = "\n=========================\n\nNome do Dono: " + this.nomeDono + "\nPossui: "+ this.numeroAnimais + " animais: \n";    
    }
      s = s + this.qualidadeTratamento;
      return s;
    }
}
