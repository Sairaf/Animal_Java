/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal_Selvagem;

import animal.Animal;
import java.util.ArrayList;

/**
 *
 * @author PROPESPINFO
 */
public class Animal_Selvagem extends Animal{
   protected static boolean liderGrupo; 
   protected ArrayList <Animal_Selvagem> grupo = new ArrayList <>();

    public Animal_Selvagem() {
        this.liderGrupo = false;
        this.grupo = null;
    }

    public Animal_Selvagem(String nomeCientifico, String classe, String codigoAnimal, int idade, String perigoExtincao, float peso, String nomePopular, int contDoenca, boolean Doente) {
        super(nomeCientifico, classe, codigoAnimal, idade, perigoExtincao, peso, nomePopular, contDoenca, Doente);
        this.liderGrupo = false;
        this.grupo = null;
    }

    public static boolean isLiderGrupo() {
        return liderGrupo;
    }

    public static void setLiderGrupo(boolean liderGrupo) {
        Animal_Selvagem.liderGrupo = liderGrupo;
    }

    public ArrayList<Animal_Selvagem> getGrupo() {
        return grupo;
    }

    public void setGrupo(Animal_Selvagem novato) {
        if(novato != null){
          this.grupo.add(novato);
        }
    }
   
   public static void Adicionar_Animal_Ao_Grupo(Animal_Selvagem lider, Animal_Selvagem novato){
       lider.setGrupo(novato);
   }
   
   @Override
   public void Habitat(){
     System.out.println("Floresta, Mar, etc."); 
   }
}
