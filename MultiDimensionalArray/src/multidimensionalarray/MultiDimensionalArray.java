/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensionalarray;

/**
 *
 * @author atonu
 */
public class MultiDimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int first_array[][] = {{1,2,3,4,},{4,3,2,1},{1,2,3,4,},{4,3,2,1}};
        int second_array[][] = {{9,8,7,6},{6,5,4,3},{1,2,3,4},{5,6,7,8}};
        
        ArrayPrint obj = new ArrayPrint();
        
        System.out.println("Elements of the first array are :");
        obj.print_array(first_array);
        
        System.out.println("Elements of the second array are :");
        obj.print_array(second_array);
        
    }
    
}
