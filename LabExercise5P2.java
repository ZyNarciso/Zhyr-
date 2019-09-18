
package labexercise5p2;
import java.util.Scanner;
public class LabExercise5P2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        
        
        //conditions
        
        if(num1 > num2){
            if(num1 > num3)
                System.out.println("Largest is " + num1);
            else System.out.println("Largest is " + num3);
        }
        else if(num2 > num1){
            if(num2 > num3)
                System.out.println("Largest is " + num2);
            else System.out.println("Largest is " + num3);
        }
        
        

    }
    
}
