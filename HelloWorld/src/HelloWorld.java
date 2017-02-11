/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atonu
 */
import java.util.Scanner;
        
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        NewClass a = new NewClass();
        a.printHello();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Hello "+name);
        
        System.out.println("Enter your age : ");
        int age = input.nextInt();
        System.out.println("Your age "+age);
    }
    
}
