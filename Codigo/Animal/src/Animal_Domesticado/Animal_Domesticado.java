/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal_Domesticado;

import Dono.Dono;
import animal.Animal;
import java.util.ArrayList;

/**
 *
 * @author PROPESPINFO
 */
public class Animal_Domesticado extends Animal{
    private static final int MAX = 10;
    
    protected String apelido;
    private Dono dono =  new Dono();
    private Dono auxDono = new Dono();        
    //protected ArrayList <Dono> dono = new ArrayList <>();


    public Animal_Domesticado(String apelido, String nomeCientifico, String classe, String codigoAnimal, int idade, float peso, String nomePopular, int contDoenca, boolean Doente) {
        super(nomeCientifico, classe, codigoAnimal, idade, peso, nomePopular, contDoenca, Doente);
        int cont;
        
        this.setApelido(apelido);
        this.setDono(dono);
    }
    
    public Animal_Domesticado(){
        super();
        this.apelido = "Nao possui";
        this.setDono(dono);            
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        if(!apelido.isEmpty()){
        this.apelido = apelido;
       }else{
        this.apelido = "Nao possui"    ;
       }
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        if(dono != null){
         this.dono = dono;
        }else{         
         this.dono = auxDono;   
        }
                
    }
   
    public void Adicionar_Dono(Dono dono){
        
       this.setDono(dono);
    }
    
        
    @Override
    public String Habitat(){
        return "Casa, Fazendas, etc.";  
    }
    
    @Override
    public String toString(){
      String s;
      int cont;
      s = super.toString();
      s = s+ "\n=========================\n\nApelido: " + this.apelido;
      s = s + "\n"  ;
      s = s + "\nHabitat: "+ this.Habitat();
      s = s +this.dono.toString();
      return s;
    }


}
