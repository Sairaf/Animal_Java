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
import static Main.Main.Menu.ShowMenu;
import java.util.ArrayList;
import java.util.Scanner;
        
/**
 *
 * @author PROPESPINFO
 */
public class Main {
    
    public static final int MAXANIMAIS = 20;

    private static void TesteMenu(Menu opcao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum Menu{
      ADICIONAR_ANIMAL_DOMESTICADO(1), ADICIONAR_ANIMAL_SELVAGEM(2), ADICIONAR_DONO(3), VERIFICAR_DOENCA(4), COMER(5), VELHICE(6), ADICIONAR_COMIDA(7), EXTINCAO(8),SAIR(0);
      
      public int opcaoEscolhida;
      
      Menu(int opcao){
          opcaoEscolhida = opcao;
      }
      
      public int get(){
        return opcaoEscolhida;  
      }
      
      public static void ShowMenu()
      {
          System.out.println("1 - Adicionar Animal Domesticado. \n");   
          System.out.println("2 - Adicionar Animal Selvagem. \n");   
          System.out.println("3 - Adicionar Dono. \n");   
          System.out.println("4 - Verificar se animal esta doente. \n");   
          System.out.println("5 - Alimentar Animal. \n");   
          System.out.println("6 - Verificar quão velho o animal está. \n");   
          System.out.println("7 - Adicionar Comida. \n");   
          System.out.println("8 - Verificar o Risco de extinção do animal");
          System.out.println("0 - Sair. \n");   
      }
    }
    
   public static void Testemenu(Menu opcao){
       do{
        if(opcao == Menu.ADICIONAR_ANIMAL_DOMESTICADO){
            
        }else if(opcao == Menu.ADICIONAR_ANIMAL_SELVAGEM){
            
        } else if(opcao == Menu.ADICIONAR_DONO){
            
        }else if(opcao ==Menu.COMER){
            
        }else if(opcao == Menu.VELHICE){
            
        }else if(opcao == Menu.VERIFICAR_DOENCA){
            
         }else if(opcao == Menu.ADICIONAR_COMIDA){
             
        }else if(opcao == Menu.EXTINCAO){
            
        }  else if(opcao == Menu.SAIR){
         System.exit(0);
        }
       }while(opcao.opcaoEscolhida != 0);
   }
    
    public static void main(String[] args) {
        
        ArrayList <Animal> animais= new ArrayList<> ();
        Dono dono = new Dono();
        Comida racao = new Comida();
        String nomeCientifico, classe, codigoAnimal, perigoExtincao, nomePopular, nomeDono, qualidadeTratamento, apelido;
        int idade, contDoenca, numAnimais, numDonos;
        float peso;
        boolean lider, doente;
        Menu opcao = null;
        
        Scanner sc = new Scanner(System.in);
        
        ShowMenu();
        System.out.println("Digite a opcao desejada");
        System.out.println("\n");
        int opcao34;
        opcao34= sc.nextInt();
    //    opcao.opcaoEscolhida = sc.nextInt();
    //    TesteMenu(opcao);
    }
}

