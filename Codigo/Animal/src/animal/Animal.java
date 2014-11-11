/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import Comida.Comida;
import java.util.Scanner;

/**
 *
 * @author ABGerson
 */
public class Animal {
    //Falta trabalhar com a classe Iddade
  // delcarado atributos  
  protected String  nomeCientifico;
  protected String  classe;
  protected String  codigoAnimal;
  protected int     idade;
  protected String  perigoExtincao;
  protected float   peso;
  protected String  nomePopular;
  protected int     contDoenca;
  protected boolean Doente;
  
  Scanner sc = new Scanner(System.in);
  
  public Animal(){
    this.nomeCientifico = "Desconhecido"  ;
    this.classe = "Desconhecida";
    this.codigoAnimal = "0000000";
    this.idade = 0;
    this.perigoExtincao ="Desconhecido";
    this.peso = 0;
    this.nomePopular = "Desconhecido";
    this.Doente = false;
    this.contDoenca = 0;
  }

    public Animal(String nomeCientifico, String classe, String codigoAnimal, int idade, String perigoExtincao, float peso, String nomePopular, int contDoenca, boolean Doente) {
        this.nomeCientifico = nomeCientifico;
        this.classe = classe;
        this.codigoAnimal = codigoAnimal;
        this.idade = idade;
        this.perigoExtincao = perigoExtincao;
        this.peso = peso;
        this.nomePopular = nomePopular;
        this.contDoenca = contDoenca;
        this.Doente = Doente;
    }

    
    public Animal(final Animal animalCpy){
        this.nomeCientifico = animalCpy.nomeCientifico;
        this.classe = animalCpy.classe;
        this.codigoAnimal = animalCpy.codigoAnimal;
        this.idade = animalCpy.idade;
        this.nomePopular = animalCpy.nomePopular;
        this.perigoExtincao = animalCpy.perigoExtincao;
        this.peso = animalCpy.peso;   
        this.contDoenca = animalCpy.contDoenca;
        this.Doente = animalCpy.Doente;
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

    public int getContDoenca() {
        return contDoenca;
    }

    public void setContDoenca(int contDoenca) {
        if(contDoenca > 0){
         this.contDoenca = contDoenca;
        }else{
          this.contDoenca = 0;  
        }
        
    }

    public boolean isDoente() {
        return Doente;
    }

    public void setDoente(boolean Doente) {
        this.Doente = Doente;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
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
   int quilo;   
   
   quilo = comida.getCalorias()/8000;
   this.peso+=quilo;
   if(comida.isQualidadeComida() == false){
     this.contDoenca++;  
    }  
   }
  
  public int Velhice(int expectativa_Vida){
    int aux = idade/expectativa_Vida;  
    if(aux < 0.25){
        System.out.println("Um filhote");  
        return 0;
    }else if(aux >= 0.25 && aux < 0.50){
        System.out.println("Ainda um garoto");   
        return 1;
    } else if(aux >= 0.50 && aux < 0.75){
        System.out.println("Um adulto");   
        return 2;
    } else if(aux >= 0.75 && aux < 1){
        System.out.println("Um velho");   
        return 3;
   }else{
        System.out.println("Alem da expectativa de vida");     
        return 4;
    }
  }
  
  public static void Verificar_Se_Esta_Doente(Animal animal, int expectativa_Vida){
      int aux; 
      aux = animal.Velhice(expectativa_Vida);
      
      if(aux == 1 && animal.contDoenca >= 5){
        System.out.println("Este animal  esta doente");  ;
      }
      
      if(aux == 2 && animal.contDoenca >= 8){
        System.out.println("Este animal  esta doente");  ;
      }
      
      if(aux == 3 && animal.contDoenca >= 10){
        System.out.println("Este animal  esta doente");  ;
      }
      
      if(aux == 4 && animal.contDoenca >= 3){
        System.out.println("Este animal  esta doente");  ;
      } else{
        System.out.println("Este animal nao esta doente");  ;
      }
  }
  
  public void Habitat()
  {
      System.out.println("Desconhecido");   
  }
  
  @Override
  public String toString(){
   String s = "\nNome cientifico: "+ this.nomeCientifico + "\n Nome Popular: " +this.nomePopular+ "\n Classe: " + this.classe + "\n Codigo do Animal: " + this.codigoAnimal + "\n Perigo de Extincao: " + this.perigoExtincao + "\n Idade: " + this.idade + "\n Peso: " +this.peso  ;   
   if(this.Doente == false){
     s = s +"\n O animal Nao esta doente. ";  
   }else{
     s = s +"\n Animal esta doente. ";    
   }
      return s;
   }
      
  
}
