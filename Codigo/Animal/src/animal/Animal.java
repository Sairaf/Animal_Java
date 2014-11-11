/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import Comida.Comida;

/**
 *
 * @author ABGerson
 */
public class Animal {
    //Falta trabalhar com a classe Iddade
  // delcarado atributos  
  private String  nomeCientifico;
  private String  classe;
  private String  codigoAnimal;
  private int     idade;
  private String  perigoExtincao;
  private float   peso;
  private String  nomePopular;
  
  
  public Animal(){
    this.nomeCientifico = "Desconhecido"  ;
    this.classe = "Desconhecida";
    this.codigoAnimal = "0000000";
    this.idade = 0;
    this.perigoExtincao ="Desconhecido";
    this.peso = 0;
    this.nomePopular = "Desconhecido";
  }

    public Animal(String nomeCientifico, String classe, String codigoAnimal, int idade, String perigoExtincao, float peso, String nomePopular, boolean doente) {
        this.nomeCientifico = nomeCientifico;
        this.classe = classe;
        this.codigoAnimal = codigoAnimal;
        this.idade = idade;
        this.perigoExtincao = perigoExtincao;
        this.peso = peso;
        this.nomePopular = nomePopular;
    }

    public Animal(final Animal animalCpy){
        this.nomeCientifico = animalCpy.nomeCientifico;
        this.classe = animalCpy.classe;
        this.codigoAnimal = animalCpy.codigoAnimal;
        this.idade = animalCpy.idade;
        this.nomePopular = animalCpy.nomePopular;
        this.perigoExtincao = animalCpy.perigoExtincao;
        this.peso = animalCpy.peso;                
    }
    
    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        if(!nomeCientifico.isEmpty() ){           
           this.nomeCientifico = nomeCientifico; 
        }else{
          this.nomeCientifico ="Nao declarado";
        }
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        if(!classe.isEmpty()){
         this.classe = classe;   
        }else{
         this.classe = "Não declarada";      
        }
        
    }

    public String getCodigoAnimal() {
        return codigoAnimal;
    }

    public void setCodigoAnimal(String codigoAnimal) {
        int cont;
        if(!codigoAnimal.isEmpty() && codigoAnimal.length() == 12 && codigoAnimal.matches("[0-9]*") && codigoAnimal!= "000000000000"){                       
         this.codigoAnimal = codigoAnimal;
        }else{
         this.codigoAnimal = "000000000000";               
        }           
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0)
         this.idade = idade;
    }

    public String getPerigoExtincao() {
        return perigoExtincao;
    }

    public void setPerigoExtincao(int populacao) {
        if(populacao > 0)
         Verificar_Perigo_Extincao(populacao);        
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso > 0)
        {
         this.peso = peso;
        }else{            
          this.peso = 10;
        }
            
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        if(!nomePopular.isEmpty())
        {
         this.nomePopular = nomePopular;
        }else{
         this.nomePopular = "Desconhecido";    
        }
            
    }

  public static String Verificar_Perigo_Extincao(int populacao){
   if(populacao < 2500)   {
    return "Especie em estado crítico de extinção";    
   }else if(populacao >= 2500 && populacao < 10000){
    return "Especie em perigo de extinção";       
   }else if(populacao >= 10000 && populacao < 20000){
    return "Especie em vulneravel a extinção";          
   }else{
    return "Especie nao esta em perigode extinção";          
   }       
  }
  
  public void Comer(Comida comida){
      
  }
  
}
