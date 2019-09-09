
package activity.one;
import java.util.Scanner;
public class ActivityOne {

    public static void main(String[] args) {
        //no.1
        System.out.println("*********      ***          *         *     ");
        System.out.println("*       *    *     *       ***       * *    ");
        System.out.println("*       *  *         *    *****     *   *   ");
        System.out.println("*       *  *         *      *      *     *  ");
        System.out.println("*       *  *         *      *     *       * ");
        System.out.println("*       *  *         *      *      *     *  ");
        System.out.println("*       *  *         *      *       *   *   ");
        System.out.println("*       *    *     *        *        * *    ");
        System.out.println("*********      ***          *         *     ");
        
        //no.2
        Scanner in = new Scanner(System.in);
       double  pizza = 12.00;      
       double toppings = 1.50;
       double tax;
       int noofpizza, nooftoppings;
       
        System.out.print("Enter the number of pizzas :");
        noofpizza = in.nextInt(); 
        System.out.print("Enter the total number of toppings :");
        nooftoppings = in.nextInt();
         
        tax = ((pizza*noofpizza) + (nooftoppings*toppings))* 1.05;
        System.out.println("Receipt:");
        System.out.println("Total number of pizza: " + noofpizza);
        System.out.println("Total number of Toppings: " + nooftoppings);
        System.out.println("Cost (incl tax): " + tax);
    }
    
}
