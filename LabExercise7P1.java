
package labexercise7p1;
import java.util.Scanner;
public class LabExercise7P1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int m1, m2, m3;
        int n1, n2, n3, Nf;
        
        
        System.out.println("Enter a three-digit integer: ");
        Nf = in.nextInt();
        
        
        //computation
        m1 = Nf / 100;
        n1 = Nf % 100;
        m2 = n1 / 10;
        n2 = n1 % 10;
        m3 = n2 % 1;
        
        // - - - - - 
        
        if(Nf >= 1000){
            System.out.println("Enter three digits: ");
        }
        else if(m1 == m3){
            System.out.println(m1 + "" + m2 + "" + m3 + " is a palindrome.");
        }
        else
            System.out.println(m1 + "" + m2 + "" + m3 + " is not a palindrome.");
        
        
    }
    
}
