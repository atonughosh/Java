/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atonu
 */
public class LoopIn {
    public static void main(String[] args){
        System.out.println("All about loops in Java......");
        int i=0;
        if(i==0){
            System.out.println("If block True, hence executed.......");
        }else
        {
            System.out.println("Never mind!");
        }
        System.out.println("Entering While block.........");
        while(i<4){
        System.out.println("While "+i);
        switch(i){
            case 0:
                System.out.println("When i = 0");
            case 1:
                System.out.println("When i = 1");
            case 3:
                System.out.println("When i = 3");
           // default:
             //   System.out.println("End of the story of 'i'");
        }
        i++;
    }
        System.out.println("Out of while block and entering if block.....");
        if(i==0){
            System.out.println("If vlock True, hence executed.......");
        }else
        {
            System.out.println("Never mind!");
        }
    }
    
}
