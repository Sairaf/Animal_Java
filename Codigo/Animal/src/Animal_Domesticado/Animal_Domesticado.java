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
    protected ArrayList <Dono> dono = new ArrayList <>();
    protected int numDonos;

    public Animal_Domesticado(String apelido, int numAcessorios, int numDonos, String nomeCientifico, String classe, String codigoAnimal, int idade, String perigoExtincao, float peso, String nomePopular, int contDoenca, boolean Doente) {
        super();
        //super(nomeCientifico, classe, codigoAnimal, idade, perigoExtincao, peso, nomePopular, contDoenca, Doente);
        int cont;
        this.apelido = apelido;
        this.numDonos = numDonos;
        this.dono = null;
    }
    
    public void Animal_Domesticado(){
        /* super();*/
        int cont;
        this.apelido = "Nao possui";
        this.numDonos = 0;
        this.dono = null;            
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

  
    public ArrayList<Dono> getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        if(dono == null){
         this.dono.add(dono);
        }        
    }

    

      public int getNumDonos() {
        return numDonos;
    }

    public void setNumDonos(int numDonos) {
        if(numDonos > 0)
        this.numDonos = numDonos;
    }
    
    public static void Adicionar_Dono(Animal_Domesticado animal, Dono dono){
       animal.setDono(dono);
    }
    
        
    @Override
    public void Habitat(){
        System.out.println("Casa, Fazendas, etc.");  
    }
    
    @Override
    public String toString(){
      String s;
      int cont;
      s = super.toString();
      s = s+ "\n Apelido: " + this.apelido;
      if(this.dono == null){
        for(cont = 0;cont <this.dono.size(); cont++)  {
          s = s + "\nDono de numero " + cont + ": " + this.dono.get(cont);
        }
      }
      return s;
    }
}
