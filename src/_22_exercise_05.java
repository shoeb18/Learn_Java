import java.util.Scanner;

public class _22_exercise_05 {

    public static void main(String[] args) {

        // write a program to print the multiplication table in reverse order

        int a;
        Scanner vb = new Scanner(System.in);

        a = vb.nextInt();

        for (int i = 10; i >= 1; i--) {

            System.out.format("%d X %d = %d\n" , a,i,(i * a));

        }

    }



    
}
