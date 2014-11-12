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
//import static Main.Main.Menu.ShowMenu;
import java.util.ArrayList;
import java.util.Scanner;
        
/**
 *
 * @author PROPESPINFO
 */
public class Main {
    
    public static final int MAXANIMAIS = 20;
    /*
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
            System.out.println("testete");
            System.exit(0);
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
    */
   public static void cls(){       
      int i;
      for( i = 0; i < 50; i++){
          System.out.println("\n");  
      }
   }
   
    public static void main(String[] args) {
        Animal[] animais = new Animal[MAXANIMAIS];
        Animal teste = new Animal();
        Animal_Domesticado auxD = new Animal_Domesticado();
        Animal_Selvagem auxS = new Animal_Selvagem();
        Dono dono = new Dono();
        Comida racao = new Comida();
        //ArrayList <Animal> animais= new ArrayList<> ();
        
        //====================================================================
        String nomeCientifico, classe, codigoAnimal, perigoExtincao = "Desconhecido", nomePopular, nomeDono, qualidadeTratamento = "Desc", apelido;
        int idade = 0, contDoenca = 0, numAnimais, numDonos, cont = 0, qualidade = 0;
        float peso;
        boolean lider, doente =  false;
        int opcao;
        //====================================================================
        
        Scanner sc = new Scanner(System.in);
        
        animais[0] = new Animal_Domesticado();
        animais[1] = new Animal_Selvagem();
        auxD = (Animal_Domesticado) animais[0];
        auxS = (Animal_Selvagem) animais[1];
        /*
        if(animais[0] instanceof Animal_Domesticado){
            cls();
            System.out.println("GOGO POWER RANGERS WOWOWOWOOWOW");   
        }*/
                  System.out.println("\nDigite o nome cientifico do animal:");
                  nomeCientifico = sc.nextLine();
                  System.out.println("\nDigite a classe do animal:");
                  classe = sc.nextLine();;
                  System.out.println("\nDigite o codigo do animal:");
                  codigoAnimal = sc.nextLine();
                  System.out.println("\nDigite o nome popular do animal:");
                  nomePopular = sc.nextLine();
                  System.out.println("\nDigite o peso do animal:");
                  peso = sc.nextFloat();
                  System.out.println("\nDigite a idade do animal:");
                  idade= sc.nextInt();
                  System.out.println("\nDigite o apelido do animal:");
                  apelido= sc.next();
                  System.out.println("\n O animal esta doente(y=0/n=1)");
                  opcao = sc.nextInt();
                  if(opcao == 0){
                     doente = true; 
                  }else{
                    doente = false;  
                  }                  
                  System.out.println("\nDigite o nome do dono: ");
                  nomeDono = sc.next();
                  System.out.println("\nEste dono possui quantos Animais?: ");
                  numAnimais = sc.nextInt();
                  System.out.println("\nDe 0 a 10, Digite a qualidade do Tratamento do dono com os senus animas: ");
                  qualidade = sc.nextInt();
                          
                  Dono auxDono = new Dono(nomeDono, qualidadeTratamento, numAnimais);
                  String pos;
                  pos = (auxDono.Verificar_Qualidade_Tratamento(qualidade));                  
                  System.out.println(pos);
                  auxDono.setQualidadeTratamento(auxDono.Verificar_Qualidade_Tratamento(qualidade));                  
                  
                  
                  animais[0] = new Animal_Domesticado(apelido, nomeCientifico, classe, codigoAnimal, idade, peso, nomePopular, contDoenca, doente);
                  auxD = (Animal_Domesticado) animais[0] ;
                  auxD.Adicionar_Dono(auxDono);
                  System.out.println(auxD);
        //5
       // cls();
        //System.out.println(auxS);
        /*
        System.out.println("Digite a opcao desejada");
        System.out.println("\n");
        opcao = sc.nextInt();
        
        do{
         switch(opcao){
             case 1:
                 if(cont < MAXANIMAIS){
                  cls();
                  System.out.println("\nDigite o nome cientifico do animal:");
                  nomeCientifico = sc.next();
                  System.out.println("\nDigite a classe do animal:");
                  classe = sc.next();
                  System.out.println("\nDigite o codigo do animal:");
                  codigoAnimal = sc.next();
                  System.out.println("\nDigite o nome popular do animal:");
                  nomePopular = sc.next();
                  System.out.println("\nDigite o peso do animal:");
                  peso = sc.nextFloat();
                  System.out.println("\nDigite a idade do animal:");
                  idade= sc.nextInt();
                  System.out.println("\nDigite o apelido do animal:");
                  apelido= sc.next();
                                    //Ajeitar o setter e getters
                  
                  
                  
                  
                 }else{
                     System.out.println("Limite de animais alcancado");   
                     ShowMenu();
                     opcao = sc.nextInt();
                 }
                 
         }            
        }while(opcao != 0);
    */
    }
}

