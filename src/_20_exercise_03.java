import java.util.Scanner;


public class _20_exercise_03 {

    public static void main(String[] args) {
        
        // write a program to sum first n natural numbers using loops

        int a;
        Scanner number = new Scanner(System.in);

        System.out.println("Enter the number");

        a = number.nextInt();
        

        int result = 0;

        for (int i = 0; i <= a; i++) {

            result = result + i;
        }
        
        System.out.println("The total sum is : " + result);


    }
    
}
