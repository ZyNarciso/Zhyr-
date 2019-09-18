
package labexercise4p1;
import java.util.Scanner;
public class LabExercise4P1 {

    
    
    public static void main(String[] args) {
        
        Scanner  in = new Scanner(System.in);
        
        double price = 0, Tprice;
        double shippingFee = 5.00;
        double tax = 0.08;
        double total;
       
         
        System.out.print("Enter the item price: ");
        price = in.nextDouble();
        if(price >= 25){
            tax = price * tax;
            Tprice = tax + price; 
            System.out.println("Tax: $" + tax);
            System.out.println("Final cost: $" + Tprice);
            
        }
        else if(price <=25){
            tax = price * tax;
            Tprice = tax + price;
            total = Tprice + 5.00;
            shippingFee = 5.00;
            
            System.out.println("Tax: " + tax);
            System.out.println("Shipping is " + shippingFee);
            System.out.println("Final cost: $" + total);
            
        }
            

        
        
    }
    
}
