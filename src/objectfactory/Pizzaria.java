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
public class Pizzaria {
    private FactoryPizza factory;
    public Pizzaria(FactoryPizza factory){
        this.factory = factory;
    }
    
    public Pizza pedirPizza(String sabor){
        Pizza pizza = factory.criarPizza(sabor);
        
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.embalar();
        
        return pizza;
    }
}
