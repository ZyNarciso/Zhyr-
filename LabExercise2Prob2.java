
package labexercise2.prob2;
import java.util.Scanner;
public class LabExercise2Prob2 {

  
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       
       int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, R2, R3, R4, R5, R6, R7, R8, R9, R10;
       
        System.out.println("Enter n1: ");
        num1 = in.nextInt();
        System.out.println("Enter n2: ");
        num2 = in.nextInt();
        System.out.println("Enter n3: ");
        num3 = in.nextInt();
        System.out.println("Enter n4: ");
        num4 = in.nextInt();
        System.out.println("Enter n5: ");
        num5 = in.nextInt();
        System.out.println("Enter n6: ");
        num6 = in.nextInt();
        System.out.println("Enter n7: ");
        num7 = in.nextInt();
        System.out.println("Enter n8: ");
        num8 = in.nextInt();
        System.out.println("Enter n9: ");
        num9 = in.nextInt();
        System.out.println("Enter n10: ");  
        num10 = in.nextInt();
        
         R2 = num1 + num2;
         R3 = R2 + num3;
         R4 = R3 + num4;
         R5 = R4 + num5;
         R6 = R5 + num6;
         R7 = R6 + num7;
         R8 = R7 + num8;
         R9 = R8 + num9;
         R10 = R9 + num10;
        
        
        System.out.println("Running Sum: "+ num1 +" , "+ R2 +" "+ R3 +" "+ R4 +" "+ R5 +" "+ R6 +" "+ R7 +" "+ R8 +" "+ R9 +" "+ R10 );
        
        
        

    }
    
}
