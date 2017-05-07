/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class Dice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        
        int Roll1, Roll2;
        Roll1 = 1 + r.nextInt(6);
        Roll2 = 1 + r.nextInt(6);
        
        System.out.println("Here comes the roll \n Roll 1: " + Roll1 + "\n Roll 2: " + Roll2);
        System.out.println("The total is " + (Roll1 + Roll2));
    }
    
}
