/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectfactory;

/**
 *
 * @author christian
 */
public class FactoryPizza {
    public Pizza criarPizza(String tipo){
        if(tipo.equalsIgnoreCase("calabresa")){
            return new Calabresa();
        }else if(tipo.equalsIgnoreCase("chocolate")){
            return new Chocolate();
        }else if(tipo.equalsIgnoreCase("Portuguesa")){
            return new Portuguesa();
        }else if(tipo.equalsIgnoreCase("mussarela")){
            return new Mussarela();
        }else if(tipo.equalsIgnoreCase("frango")){
            return new Frango();
        }
        return null;
    }
}
