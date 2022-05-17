public class _17_break_and_continue {

    public static void main(String[] args) {
        
        int n = 10;


        // break ki madat se ham loop ke bahar aa jate hai
        // continue ki madat se ham next iteration pe move kar jate hai
        for (int i = 0; i < n; i++) {
            if (i == 5) {
                // break;
                continue;
            }
            System.out.println(i);
        }


    }
    
}
