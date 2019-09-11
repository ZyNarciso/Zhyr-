
package labexercise2;
import java.util.Scanner;
public class LabExercise2 {

    public static void main(String[] args) {      
      
        Scanner in = new Scanner(System.in);  
        
                
        double FedTaX = 0.15;
        double FedTax2;
        double STax = 0.035;
        double STax2;
        double SSTax = 0.0575;
        double SSTax2;
        double MedTax = 0.0275;
        double MedTax2;
        double PenPlan = 0.05;
        double PenPlan2;
        double HInsurance = 75;
        double NetPay, Add, Gross;
        
        System.out.println("Enter Employee Name: ");
        String Employee = in.nextLine();
        System.out.println("Gross Amount: ");
        Gross = in.nextInt();
        
        FedTax2 = Gross * FedTaX ;
        STax2 = Gross * STax;
        SSTax2 = Gross * SSTax;
        MedTax2 = Gross * MedTax;
        PenPlan2 = Gross * PenPlan;
        NetPay = FedTax2 + STax2 + SSTax2 + MedTax2 + PenPlan2 + HInsurance;
        Add = Gross - NetPay;
        
        System.out.printf("Name: " + Employee);
        System.out.printf("\nGross Amount:$%.2f" , Gross);   
        System.out.printf("\nFederal Tax: $%.2f" , FedTax2);
        System.out.printf("\nState Tax: $%.2f" , STax2 );
        System.out.printf("\nSocial Security Tax: $%.2f" , SSTax2);
        System.out.printf("\nMedicare Tax: $%.2f" , MedTax2);
        System.out.printf("\nPension Plan: $%.2f" , PenPlan2);
        System.out.printf("\nHealth Insurance:$75.00" , HInsurance );
        System.out.printf("\nNet Pay: $%.2f" , Add);  
    
    }
    
}
