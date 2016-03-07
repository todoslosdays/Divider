//lol que
package pkgsuper.task;

import java.util.Scanner;

/**
 *
 * @author todoslosdays
 */
public class Divider {

   
    public static void main(String[] args) {
        //count how many times it takes in order to divide a number to zero from a double's perspective
        Scanner keyboard = new Scanner(System.in);
        int counter = 0;
        
        
        System.out.println("Please enter any number");
        double number = keyboard.nextDouble();
        
        System.out.println("Please enter the number you would like to divide by");
        double dividen = keyboard.nextDouble();
        
        while (number > 0 ){
            number = number / dividen;
        System.out.println(number);
        
        counter++;
       
        }
        System.out.println("It took " + counter + " times to complete this task");
    }
    
}
