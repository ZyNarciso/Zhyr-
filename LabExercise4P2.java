
package labexercise4p2;
import java.util.Scanner;
public class LabExercise4P2 {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float BMI;
        float kilogram, meters;
        
        
        System.out.print("Enter weight in kilograms: ");
        kilogram = in.nextFloat();
        System.out.print("Enter height in meters: ");
        meters = in.nextFloat();
        
        BMI = kilogram / (meters * meters);
        
        if(BMI <= 18.5){
            System.out.printf("BMI Result: %.2f" , BMI);
            System.out.println(" ");
            System.out.println("Underweight");
            
        }
        
        else if(BMI <= 24.9){
            System.out.printf("BMI Result: %.2f" , BMI);
            System.out.println(" ");
            System.out.println("Normal");
            
        }
        
        else if(BMI <= 29.9){
            System.out.printf("BMI Result: %.2f" , BMI);
            System.out.println(" ");
            System.out.println("Overweight");     
        }
         
        else if(BMI >= 30){    
            System.out.printf("BMI Result: %.2f" , BMI);
            System.out.println(" ");
            System.out.println("Obese");
        }

        else{
            System.out.println(" ");
        }
        
    }
    
}
