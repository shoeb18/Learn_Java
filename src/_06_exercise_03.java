import java.util.Scanner;

public class _06_exercise_03 {

    public static void main(String[] args) {
        
        // get students marks input in 5 subjects and calculates its percentage

        int mark1, mark2, mark3, mark4, mark5;

        Scanner vb = new Scanner(System.in);

        System.out.println("Enter the 1 subject mark : ");
        mark1 = vb.nextInt();

        System.out.println("Enter the 2 subject mark : ");
        mark2 = vb.nextInt();

        System.out.println("Enter the 3 subject mark : ");
        mark3 = vb.nextInt();

        System.out.println("Enter the 4 subject mark : ");
        mark4 = vb.nextInt();

        System.out.println("Enter the 5 subject mark :");
        mark5 = vb.nextInt();


        System.out.println("The total percentage is = " + (mark1 + mark2 + mark3 + mark4 + mark5) / 5);


        
    }
    
}
