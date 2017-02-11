/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancedforloop;

/**
 *
 * @author atonu
 */
public class EnhancedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Add obj = new Add();
        int total = 0;
        int arr[] = new int[3];
        
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        
        total = obj.sum_of_array(arr);
        
        System.out.println("The sum of the elements of the array is = :"+total);
    }
    
}
