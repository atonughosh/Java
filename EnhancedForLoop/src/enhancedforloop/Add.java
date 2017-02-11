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
public class Add {
    int sum_of_array(int array[]){
        int total=0;
        for(int x: array)
            total+=x;
        return total;
    }
}