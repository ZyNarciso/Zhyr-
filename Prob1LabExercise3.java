
package prob1labexercise3;
import java.util.Scanner;
public class Prob1LabExercise3 {
    
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long seconds, hour, minutes, Rseconds, Rminutes;
        
        
        System.out.println("Enter time in seconds: ");
        seconds = in.nextLong();
        
        
        
        // computation
       hour = seconds / 3600;
       minutes = seconds / 60;
       Rseconds = seconds %60;
       Rminutes = minutes - (hour * 60);
       
       
       //print
        System.out.println("Time is " + hour + " hour" + Rminutes + " minutes " + Rseconds + " seconds ");
       
        
        
        
        
        
        

    }
    
}
