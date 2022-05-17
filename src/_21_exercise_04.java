import java.util.Scanner;

public class _21_exercise_04 {

    public static void main(String[] args) {
        
        // write a program to print multiplication table of a given number
        int a;
        Scanner multi = new Scanner(System.in);

        a = multi.nextInt();


        for (int i = 1; i <= 10; i++) {

            // System.out.println(a+" X "+i+" = "+(a*i));
            System.out.format("%d X %d = %d\n",a,i,(a*i));
            
        }
    }
    
}
