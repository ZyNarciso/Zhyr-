
package labexercise7p2;
import java.util.Scanner;
public class LabExercise7P2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int Day;
        int Elapse, ElapseT;
        String DayW;
        
        System.out.print("Enter today's day: ");
        Day = in.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        Elapse = in.nextInt();
        
        ElapseT = (Day + Elapse)%7;
        DayW = "" ;
        
        
        
        
        switch(Day){
            case 0:
                DayW = "Sunday";
                break;
            case 1:
                DayW = "Monday";
                break;
            case 2:
                DayW = "Tuesday";
                break;
            case 3:
                DayW = "Wednesday";
                break;
            case 4:
                DayW = "Thursday";
                break;
            case 5:
                DayW = "Friday";  
                break;
            case 6:
                DayW = "Saturday"; 
                break;
            
        }
        
        switch(ElapseT){
            case 0: 
                System.out.println("Today is " + DayW + " and the future is Sunday");
                break;
            case 1:
                System.out.println("Today is " + DayW + " and the future is Monday");
                break;
            case 2:
                System.out.println("Today is " + DayW + " and the future is Tuesday");
                break;   
            case 3:
                System.out.println("Today is " + DayW + " and the future is Wednesday");
                break;
            case 4:
                System.out.println("Today is " + DayW + " and the future is Thursday");
                break; 
            case 5:
                System.out.println("Today is " + DayW + " and the future is Friday");
                break;    
            case 6:
                System.out.println("Today is " + DayW + " and the future is Saturday");
                break;    
                
        }
        
        
        
        
        
        

    }
    
}
