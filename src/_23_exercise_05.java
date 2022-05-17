import java.util.Scanner;

public class _23_exercise_05 {

    public static void main(String[] args) {

        // write a program to print the factorial of given number 
        // but use all three loops

        int a;
        Scanner vb = new Scanner(System.in);

        System.out.println("Enter the number");
        a = vb.nextInt();

        int result = 1;
        int i = 1;
        // * using for loop
        // for (int i = 1; i <= a; i++)
        // {
        //     result = result * i;
        // }

        // * using while loop
        // while(i<=a){
        //     result = result * i;
        //     i++;
        // }

        // * using do while loop
        
        do{
            
            result = result * i;
            i++;
        } while (i <= a);
        System.out.println("The factorial of " + a + " is : " + result);

    }
 
}
