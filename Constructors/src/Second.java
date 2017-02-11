/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atonu
 */
public class Second {
    private String nname;
    
    public Second(String name){
        nname = name;
    }
    
    public String getName(){
        return nname;
    }
    
    public void printName(){
        System.out.println("Hello "+getName());
    }
}
