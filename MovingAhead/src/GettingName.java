/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atonu
 */
import java.util.Scanner; //importing rhe Scanner

public class GettingName {
    Scanner input = new Scanner(System.in); //Initializing "input" as Scanner
    String getName(){
        return input.nextLine();
    }    
}
