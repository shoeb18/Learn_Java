import java.util.Scanner;

public class _16_Loops {

    public static void main(String[] args) {


        int n;

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        // for loop
        // for (int i = 1; i <= n; i++) {
        //     System.out.println(i);
        // }

        // while loop

        int i = 1 ;
        // while (i <= n) {            
        //     System.out.println(i);
        //     i++;
        // }
        
        
        // do while  loop
        do{
            System.out.println(i);
            i++;
        }while(i <= n);
        
        
        

    }
    
}
