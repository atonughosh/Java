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
public class Average {
    static int avg(int...numbers){
        int total = 0;
        for(int x: numbers)
            total+=x;
        return total/numbers.length;
    }
}
