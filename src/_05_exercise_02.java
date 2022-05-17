import java.util.Scanner;


public class _05_exercise_02 {

    public static void main(String[] args) {
        
        // get user input 2 integers and print its sum


        int a;
        int b;
        Scanner vb = new Scanner(System.in);
        System.out.println("Enter the two number ");
        a = vb.nextInt();
        b = vb.nextInt();


        System.out.println("the total is = " + (a+b));

    }
    
}
