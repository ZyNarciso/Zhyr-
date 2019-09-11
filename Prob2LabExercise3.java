
package prob2labexercise3;
import java.util.Scanner;
public class Prob2LabExercise3 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double distance, gallonM, priceG, cost;
        
        System.out.println("Enter the driving distance: ");
        distance = in.nextDouble();
        System.out.println("Enter miles per gallon: ");
        gallonM = in.nextDouble();
        System.out.println("Enter price per gallon: ");
        priceG = in.nextDouble();
        
        cost = (distance / gallonM) * priceG;
 
        System.out.printf("The cost of driving is: $%.2f" , cost );
        System.out.println("\n");
        

    }
    
}
