/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Comida.Comida;
import animal.Animal;
import Animal_Domesticado.Animal_Domesticado;
import Animal_Selvagem.Animal_Selvagem;
import Dono.Dono;
        
/**
 *
 * @author PROPESPINFO
 */
public class Main {
    
    public enum Menu{
      ADICIONAR_ANIMAL(1), ADICIONAR_DONO(2), VERIFICAR_DOENCA(3), COMER(4), VELHICE(5), VERIFICAR_SAUDE_ANIMAL(6), SAIR(7);
      
      public int opcaoEscolhida;
      Menu(int opcao){
          opcaoEscolhida = opcao;
      }
      
      public int get(){
        return opcaoEscolhida;  
      }
    }
    
   public void Testemenu(){
       
   }
    
    public static void main(String[] args) {
        
    }
}

