import java.util.Scanner;

public class _15_exercise_03 {

    public static void main(String[] args) {
        
        // use switch case and print the week day as per input number
        int week_day;

        Scanner scan = new Scanner(System.in);
        week_day = scan.nextInt();
        
        switch (week_day) {

            case 1:
            System.out.println("Sunday!");
            break;
            
            case 2:
            System.out.println("Monday!");
            break;

            case 3:
            System.out.println("Tuesday!");
            break;

            case 4:
            System.out.println("Wednesday!");
            break;

            case 5:
            System.out.println("Thursday!");
            break;

            case 6:
            System.out.println("Friday!");
            break;

            case 7:
            System.out.println("Saturday!");
            break;

        }

    }
    
}
