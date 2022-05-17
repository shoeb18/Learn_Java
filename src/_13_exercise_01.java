import java.util.Scanner;

public class _13_exercise_01 {

    public static void main(String[] args) {
        
        // get user age as an input and show he is eligible for voting or not
        // and condition is user is greater than age 18 and less than 100

        int age;

        Scanner vb = new Scanner(System.in);

        System.out.println("Enter your age");

        age = vb.nextInt();
        
        if (age >= 18 && age < 100) {

            System.out.println("you eligible for voting card");
        }
        else {

            System.out.println("You not eligible for voting card");
         }
    }
    
}
