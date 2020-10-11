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
public class Calabresa implements Pizza{
    @Override
    public void preparar() {
        System.out.println("Preparando a pizza...");
    }

    @Override
    public void assar() {
        System.out.println("Assando a pizza...");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando a pizza...");
    }

    @Override
    public void embalar() {
        System.out.println("Preparando a pizza...");
    }
}
