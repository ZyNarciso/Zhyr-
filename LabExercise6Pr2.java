
package labexercise6pr2;
import java.util.Scanner;
import java.util.Random;
public class LabExercise6Pr2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random on = new Random();
        
        int Player, Computer;
        int Rock = 0;
        int Scissors = 1;
        int Paper = 2;
        
        
        System.out.println("Rock: 0     Scissors: 1     Paper: 2");
        System.out.print("Choose:");
        Player = in.nextInt();
        System.out.print("The computer choose: ");
        Computer = on.nextInt(2);
        
        if(Player == 0 && Computer == 1){
            System.out.println(Computer);
            System.out.println("Player: Rock\nComputer: Scissors");
            System.out.println("You Win");
        }
        else if(Player == 1 && Computer == 0){
            System.out.println(Computer);
            System.out.println("Player: Scissors\nComputer: Rock");
            System.out.println("You Lose");
        }
        else if(Player == 1 && Computer == 2){
            System.out.println(Computer);
            System.out.println("Player: Scissors\nComputer: Paper");
            System.out.println("You Win");
        }
        else if(Player == 2 && Computer == 1){
            System.out.println(Computer);
            System.out.println("Player: Paper\nComputer: Scissors");
            System.out.println("You Lose");
        }
        else if(Player == 2 && Computer == 0){
            System.out.println(Computer);
            System.out.println("Player: Paper\nComputer: Rock");
            System.out.println("You Win");
        }
        else if(Player == 0 && Computer == 2){
            System.out.println(Computer);
            System.out.println("Player: Rock\nComputer: Paper");
            System.out.println("You Lose");
        }
        else if (Player == 0 && Computer == 0){
            System.out.println(Computer);
            System.out.println("Player: Rock\nComputer: Rock");
            System.out.println("Draw");
        }
        else if (Player == 1 && Computer == 1){
            System.out.println(Computer);
            System.out.println("Player: Scissors\nComputer: Scissors");
            System.out.println("Draw");
        }  
        else if (Player == 2 && Computer == 2){
            System.out.println(Computer);
            System.out.println("Player: Paper2\nComputer: Paper");
            System.out.println("Draw");
        }
            
        

    }
    
}
