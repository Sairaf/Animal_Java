/**
 *
 * @author Abner Farias - 12/11/2014
 * 
 * Aqui que a execução do programa ocorre. Recebendo os import das classes auxiliares e subclasses,
 * Esta classe possui um menu para poder realizar as ações desejadas(Adicionar animal, alimentá-lo, verificar se ele corre risco de extincao, etc.)
 * Ela possui dois métodos: "ShowMenu()" que mostra as opções que veresão ser tomadas, e o "cls()", que "emula" a função
 * system("cls") do c++.
 * 
 * No mais, a classe possui diversos atributos que auxiliarão na criação dos objetos, e a maior parte do programa é feito nas outras classes
 * 
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
          System.out.println("7 - Verificar o Risco de extinção do animal");
          System.out.println("8 - Listar");
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
        Dono dono = new Dono();
        Comida comida = new Comida();
        //ArrayList <Animal> animais= new ArrayList<> ();
        
        //====================================================================
        int cont = 0;
        
        String nome_Cientifico, classe, codigo_Animal, perigo_Extincao = "Desconhecido", nome_Popular, nome_Dono, qualidade_Tratamento = "Desc", apelido, nomeComida;
        int idade = 0, cont_Doenca = 0, num_Animais, num_Donos, qualidade_Dono = 0, expectativa_Vida,populacao ;
        float peso,calorias;
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
                  animais[cont] = auxD;
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
                  animais[cont] = auxS;
                  cont++;
                 }else{
                     System.out.println("Limite de animais alcancado");                      
                 }
                 ShowMenu();
                 opcao = sc.nextInt();
                 break;
                 
             case 3:
             
                 opcao = cont+2;
                 while(opcao > cont){
                  System.out.println("Qual animal voce deseja adicionar dono? ");         
                  opcao = sc.nextInt();
                 }
                 
                  if(animais[opcao] instanceof Animal_Domesticado){
                   
                  System.out.println("\nDigite o nome do dono: ");
                  nome_Dono = sc.next();
                  System.out.println("\nEste dono possui quantos Animais?: ");
                  num_Animais = sc.nextInt();
                  System.out.println("\nDe 0 a 10, Digite a qualidade do Tratamento do dono com os seus animas: ");
                  qualidade_Dono = sc.nextInt();
                  dono.setNomeDono(nome_Dono);;
                  dono.setNumeroAnimais(num_Animais);
                  dono.Verificar_Qualidade_Tratamento(qualidade_Dono);
                  auxD = (Animal_Domesticado) animais[opcao];
                  auxD.setDono(dono);
                  animais[opcao] = auxD;
                  }else{
                      System.out.println("Animais selvagens nao tem dono...Eu acho");   
                  }

                 ShowMenu();
                 opcao = sc.nextInt();
                 break;
             case 4:
                 opcao = cont+2;
                 while(opcao > cont){
                  System.out.println("Qual animal voce deseja Verificar se esta doente? ");         
                  opcao = sc.nextInt();
                 }
             
                 animais[cont].Verificar_Se_Esta_Doente(auxS, opcao);
                 System.out.println("\n");
                 ShowMenu();
                 opcao = sc.nextInt();
                 break;
             case 5:
                 cls();
                 opcao = cont+2;
                 while(opcao > cont){
                  System.out.println("Qual animal voce deseja alimentar? ");         
                  opcao = sc.nextInt();
                 } 
                 System.out.println("\nDigite o nome da Comida: ");
                 nomeComida = sc.next();
                 System.out.println("\nDigite quantas calorias a comida possui");
                 System.out.println("\n 8000 calorias = 1 kilo");
                 calorias = sc.nextFloat();
                 System.out.println("\nHa Quantos meses ela foi produzida");
                 meses = sc.nextInt();
                 
                 comida.setNomeComida(nomeComida);
                 comida.setCalorias(calorias);
                 comida.setMesesProducao(meses);
                 
                 animais[opcao].Comer(comida);
                 
                 System.out.println("\n");
                 ShowMenu();
                 opcao = sc.nextInt();
                 break;
                 
             case 6:    
                 cls();
                 opcao = cont+2;
                 while(opcao > cont){
                  System.out.println("Qual animal voce deseja alimentar? ");         
                  opcao = sc.nextInt();
                 }
                 System.out.println("Digite a Expectativa de vida deste animal: ");
                 expectativa_Vida = sc.nextInt();
                 animais[opcao].Velhice(expectativa_Vida);
                 
                 System.out.println("\n\n");
                 ShowMenu();
                 opcao = sc.nextInt();
                 break;
             case 7:
                 cls();
                 opcao = cont+2;
                 while(opcao > cont){
                  System.out.println("Qual animal voce deseja alimentar? ");         
                  opcao = sc.nextInt();
                 }
                 
                 System.out.println("Digite a populacao deste animal");
                 populacao = sc.nextInt();
                 
                 animais[opcao].Verificar_Perigo_Extincao(populacao);
                 
                 System.out.println("\n\n");
                 ShowMenu();
                 opcao = sc.nextInt();
                 break;
             case 8:
                 for(opcao = 0; opcao <cont; opcao++){
                     System.out.println(animais[opcao]);  
                 }
                 
                 System.out.println("\n\n");
                 ShowMenu();
                 opcao = sc.nextInt();
                 break;
             case 0:
                 System.exit(0);
             default:
                 System.out.println("Opcao invalida");
                 System.out.println("\n\n");
                 ShowMenu();
                 opcao = sc.nextInt();
                 break;
         }            
        }while(opcao != 0);
       }
        
    }
 



