
package labexercise5p1;
import java.util.Scanner;
public class LabExercise5P1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1, n2, n3, n4, n5, n6, n7, n8, totalS = 0;
        
        
        System.out.println("Answer each of the following questions with a number from 1 to 5 such that 1 means NEVER and 5 means ALWAYS");
        System.out.print("1. I am competitive: ");
        n1 = in.nextInt();
        System.out.print("2. I am annoyed by people who are late for appointments: ");
        n2 = in.nextInt();
        System.out.print("3. I perform several tasks simultaneously: ");
        n3 = in.nextInt();
        System.out.print("4. I am ambitious: ");
        n4 = in.nextInt();
        System.out.print("5. I rush to get tasks completed: ");
        n5 = in.nextInt();
        System.out.print("6. I worry about the future: ");
        n6 = in.nextInt();
        System.out.print("7. I am in a race with time: ");
        n7 = in.nextInt();
        System.out.print("8. I speak very rapidly: ");
        n8 = in.nextInt();
        
        //computation
         totalS = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8;    
        System.out.print("Score: " + totalS);      
        
        
        //conditions

         if(totalS <= 11){
            System.out.println(" Type B ");
        }
          else if(totalS <= 20){
            System.out.println(" Between A and B, tending towards B ");
        }
         else if(totalS <= 34){
            System.out.print(" Between A and B, tending towards A");
        }
         else if(totalS <= 40){
            System.out.print(" Type A 30");
        }
        
        
       
        
        
        
        

    }
    
}
