/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Comida.Comida;
import animal.Animal;
import animal.Animal_Domesticado;
import animal.Animal_Selvagem;
import Dono.Dono;
//import static Main.Main.Menu.ShowMenu;
//import java.util.ArrayList;
import java.util.Scanner;
        
/**
 *
 * @author PROPESPINFO
 */
public class Main {
    
    public static final int MAXANIMAIS = 20;  
    
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

   public static void cls(){       
      int i;
      for( i = 0;i < 20; i++){
          System.out.println("\n");  
      }
   }
   
    
    public static void main(String[] args) {
        Animal[] animais = new Animal[MAXANIMAIS];
        Animal_Domesticado auxD = new Animal_Domesticado();
        Animal_Selvagem auxS = new Animal_Selvagem();
        
        //ArrayList <Animal> animais= new ArrayList<> ();
        
        //====================================================================
        int cont = 0;
        
        String nome_Cientifico, classe, codigo_Animal, perigo_Extincao = "Desconhecido", nome_Popular, nome_Dono, qualidade_Tratamento = "Desc", apelido, nomeComida;
        int idade = 0, cont_Doenca = 0, num_Animais, num_Donos, qualidade_Dono = 0, calorias;
        float peso;
        boolean lider = false, doente =  false, qualidade_Comida = true;
        int opcao,meses;
        
        Scanner sc = new Scanner(System.in);
        //tipoComida?
        //====================================================================
        ShowMenu();
        System.out.println("\n");
        System.out.println("Digite a opcao desejada: ");
        opcao = sc.nextInt();
        
        
         do{
         switch(opcao){
             case 1:
                 if(cont < MAXANIMAIS){
                  cls();
                  System.out.println("\nDigite o nome cientifico do animal:");
                  nome_Cientifico = sc.nextLine();
                  System.out.println("\nDigite a classe do animal:");
                  classe = sc.nextLine();;
                  System.out.println("\nDigite o codigo do animal:");
                  codigo_Animal = sc.nextLine();
                  System.out.println("\nDigite o nome popular do animal:");
                  nome_Popular = sc.nextLine();
                  System.out.println("\nDigite o peso do animal:");
                  peso = sc.nextFloat();
                  System.out.println("\nDigite a idade do animal:");
                  idade= sc.nextInt();
                  System.out.println("\nDigite o apelido do animal:");
                  apelido= sc.next();
                  doente = false;                        
                  animais[cont] = new Animal_Domesticado(apelido, nome_Cientifico, classe, codigo_Animal, idade, peso, nome_Popular, cont_Doenca, doente);
                  auxD = (Animal_Domesticado) animais[cont];
                  System.out.println("Animal Domestico adicionado com sucesso!!!");                                    
                  cont++;
                 }else{
                     System.out.println("Limite de animais alcancado");                      
                 }
                 ShowMenu();
                 opcao = sc.nextInt();
                 break;
                 
             case 2:
                 if(cont < MAXANIMAIS){
                  cls();
                  System.out.println("\nDigite o nome cientifico do animal:");
                  nome_Cientifico = sc.nextLine();
                  System.out.println("\nDigite a classe do animal:");
                  classe = sc.nextLine();;
                  System.out.println("\nDigite o codigo do animal:");
                  codigo_Animal = sc.nextLine();
                  System.out.println("\nDigite o nome popular do animal:");
                  nome_Popular = sc.nextLine();
                  System.out.println("\nDigite o peso do animal:");
                  peso = sc.nextFloat();
                  System.out.println("\nDigite a idade do animal:");
                  idade= sc.nextInt();
                  if(lider == false){
                   System.out.println("\nEste animal e o lider do grupo: (0-y/1-n): ");
                   opcao = sc.nextInt();
                   if(opcao == 0){
                   lider = true;                        
                   }else{
                    lider = false;   
                   }
                  }
                  
                  doente = false;                        
                  animais[cont] = new Animal_Selvagem(lider, nome_Cientifico, classe, codigo_Animal, idade, perigo_Extincao, peso, nome_Popular, cont_Doenca, doente);
                  auxS = (Animal_Selvagem) animais[cont];
                  System.out.println("Animal Domestico adicionado com sucesso!!!");                                    
                  cont++;
                 }else{
                     System.out.println("Limite de animais alcancado");                      
                 }
                 ShowMenu();
                 opcao = sc.nextInt();
                 break;
                 
             case 3:
             {
                 opcao = cont+2;
                 while(opcao > cont){
                  System.out.println("Qual animal voce deseja adicionar dono? ");         
                  opcao = sc.nextInt();
                 }
                 
                  System.out.println("\nDigite o nome do dono: ");
                  nome_Dono = sc.next();
                  System.out.println("\nEste dono possui quantos Animais?: ");
                  num_Animais = sc.nextInt();
                  System.out.println("\nDe 0 a 10, Digite a qualidade do Tratamento do dono com os seus animas: ");
                  qualidade_Dono = sc.nextInt();
             }
         }            
        }while(opcao != 0);
    }
        
        /*
        animais[0] = new Animal_Domesticado();
        animais[1] = new Animal_Selvagem();
        auxD = (Animal_Domesticado) animais[0];
        auxS = (Animal_Selvagem) animais[1];

                  System.out.println("\nDigite o nome cientifico do animal:");
                  nome_Cientifico = sc.nextLine();
                  System.out.println("\nDigite a classe do animal:");
                  classe = sc.nextLine();;
                  System.out.println("\nDigite o codigo do animal:");
                  codigo_Animal = sc.nextLine();
                  System.out.println("\nDigite o nome popular do animal:");
                  nome_Popular = sc.nextLine();
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
                  nome_Dono = sc.next();
                  System.out.println("\nEste dono possui quantos Animais?: ");
                  num_Animais = sc.nextInt();
                  System.out.println("\nDe 0 a 10, Digite a qualidade do Tratamento do dono com os seus animas: ");
                  qualidade_Dono = sc.nextInt();
                          
                  Dono dono = new Dono(nome_Dono, qualidade_Tratamento, num_Animais);
                  String pos;
                  pos = (dono.Verificar_Qualidade_Tratamento(qualidade_Dono));                  
                  System.out.println("\nJust popping out: " + pos+"\n");
                  dono.setQualidadeTratamento(pos);                  
                  
                  if(dono.getNomeDono().equalsIgnoreCase("Clotilde")){
                      
                  }
                  
                  animais[cont] = new Animal_Domesticado(apelido, nome_Cientifico, classe, codigo_Animal, idade, peso, nome_Popular, cont_Doenca, doente);
                  auxD = (Animal_Domesticado) animais[cont] ;
                  auxD.setDono(dono);
                  System.out.println(auxD);
                  cont++;
                  
                  //============================================================================
                  System.out.println("\nDigite o nome da racao");
                  nomeComida = sc.next();
                  System.out.println("\nQuantas calorias esta racao possui");
                  System.out.println("s\nOBS: 8000 CALORIAS == 1 KILO\n\n");
                  calorias = sc.nextInt();
                  System.out.println("Qual era a qualidade da comida?: (0 - para boa/ - para estragada)");
                  opcao = sc.nextInt();
                  if(opcao == 0){
                    qualidade_Comida = true;  
                  }else{
                    qualidade_Comida = false;  
                  }
                  System.out.println("Ha quanto tempo esta racao foi produzida: ");
                  meses = sc.nextInt();
                  
                  Comida racao = new Comida(nomeComida, calorias, qualidade_Comida, meses);
                  auxD.Comer(racao);
                  cls();
                  System.out.println(auxD);     
       /*         
        if(animais[0] instanceof Animal_Domesticado){
            cls();
            System.out.println("GOGO POWER RANGERS WOWOWOWOOWOW");   
        }*/
                  
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
 



