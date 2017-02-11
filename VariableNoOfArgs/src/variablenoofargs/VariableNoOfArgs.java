/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablenoofargs;

/**
 *
 * @author atonu
 */
public class VariableNoOfArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int average = 0;
        average = Average.avg(54,96,54,2,33,69,75);
        System.out.println("Average of the numbers is :"+average);
    }
    
}
