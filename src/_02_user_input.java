import java.util.Scanner;

public class _02_user_input {

    public static void main(String[] args) {
        
        int n;
        Scanner vb = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = vb.nextInt();

        System.out.println("The number is : "+ n);
        
    }
    
}
