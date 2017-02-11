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
public class ArrayPrint {
    void print_array(int array[][]){
        for(int row=0; row<array.length; row++){
            for(int column=0; column<array[row].length; column++){
                System.out.print(array[row][column]+"\t");
            }
            System.out.println();
        }
    }
}
