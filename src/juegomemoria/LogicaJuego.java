/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegomemoria;

import java.util.Random;

/**
 *
 * @author 2020
 */
public class LogicaJuego {
    public int[] getCardNumbers() {
        
        int[] numbers = new int[30];
        int count = 0;
        
        while(count < 30) {
            Random r = new Random();
            int na = r.nextInt(15) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 30; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }//fin
            
        }
        
        
        return numbers;
    }
}
