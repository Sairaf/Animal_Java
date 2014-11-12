/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import animal.Animal;
import java.util.ArrayList;

/**
 *
 * @author PROPESPINFO
 */
public class Animal_Selvagem extends Animal{
   
   protected static final int MAXGRUPO = 20;  
   protected int numGrupo;
   protected static boolean liderGrupo; 
   protected Animal_Selvagem[] grupo = new Animal_Selvagem[MAXGRUPO];
  // protected ArrayList <Animal_Selvagem> grupo = new ArrayList <>();

    public Animal_Selvagem() {
        this.numGrupo = 0;
        this.setLiderGrupo(false);
        int i;
        for(i = 0; i < MAXGRUPO; i++)
        this.setGrupo(null);
    }

    public Animal_Selvagem(boolean lider, String nomeCientifico, String classe, String codigoAnimal, int idade, String perigoExtincao, float peso, String nomePopular, int contDoenca, boolean Doente) {
        super(nomeCientifico, classe, codigoAnimal, idade,  peso, nomePopular, contDoenca, Doente);
        this.numGrupo = 0;
        this.setLiderGrupo(lider);
        int i;
        for(i = 0; i < MAXGRUPO; i++)
        this.setGrupo(null);
    }

 

    public Animal_Selvagem[] getGrupo() {
        return grupo;
    }
 
    public void setGrupo(Animal_Selvagem novato) {
        if(this.numGrupo < MAXGRUPO && novato != null) 
            this.grupo[numGrupo] = novato;               
    }

    public static boolean isLiderGrupo() {
        return liderGrupo;
    }

    public static void setLiderGrupo(boolean liderGrupo) {
        Animal_Selvagem.liderGrupo = liderGrupo;
    }
/*
    public ArrayList<Animal_Selvagem> getGrupo() {
        return grupo;
    }

    public void setGrupo(Animal_Selvagem novato) {
        if(novato != null){
          this.grupo.add(novato);
        }
    }
  */ 
   public static void Adicionar_Animal_Ao_Grupo(Animal_Selvagem lider, Animal_Selvagem novato){
      lider.setGrupo(novato);
   }
   
   @Override
   public String Habitat(){
     return "Floresta, Mares, etc."; 
   }
   
   @Override
   public String toString(){
       String s= super.toString();
       int cont;
       if(this.liderGrupo == false)
       {
        s = s+ "\n Este animal nao e o lider do grupo";   
       }else{
        s = s+ "\n Este animal e o lider do grupo";      
       }
       s = s + "\n Grupo: ";
       for(cont = 0; cont < this.numGrupo; cont++){
       s = s+ "\n Animal numero " + cont + ": " + this.grupo[cont];
    }
       return s;
   }
   
}
