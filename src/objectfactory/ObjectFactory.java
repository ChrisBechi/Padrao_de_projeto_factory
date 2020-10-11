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
public class ObjectFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizzaria ze = new Pizzaria(new FactoryPizza());
        Pizza pizza = ze.pedirPizza("calabresa");
    }
    
}
