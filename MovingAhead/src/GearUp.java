/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atonu
 */

public class GearUp {
    public static void main(String[] args){
    System.out.println("Enter your name :");
    GettingName a = new GettingName();
    Greet b = new Greet();
    String name = a.getName();
    b.sayHello(name);
    }
}
