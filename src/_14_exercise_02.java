import java.util.Scanner;

public class _14_exercise_02 {

    public static void main(String[] args) {

        // get user input marks in 3 subjects 
        // and check if its total percetage < 35 then declare fail 

        float mark1, mark2, mark3;

        Scanner vb = new Scanner(System.in);

        System.out.println("Enter the first subject mark");
        mark1 = vb.nextFloat();

        System.out.println("Enter the second subject mark");
        mark2 = vb.nextFloat();

        System.out.println("Enter the third subect mark");
        mark3 = vb.nextFloat();

        float result;
        
        result = (mark1 + mark2 + mark3) / 3;
        
        if (result >= 35)
        {
            System.out.format("You are pass and your total percentage is : %.2f " , result);
        }
        else {
            System.out.format("You are fail and your total percentage is : %.2f " , result);
            
        }
        
        
    }
    
}
