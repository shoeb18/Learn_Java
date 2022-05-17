public class _08_operators {

    public static void main(String[] args) {
        
        int a = 4;
        int b = 5;

        // Arithmetic operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a % b);
        

        // operator precedence

        int result = 45 / 5 * (3 + 4);

        System.out.println(result);



        // increament and decrement operators

        // ++num increament kardega 1 se wahi par
        // num++ increament kardega 1 se next use ke liye
        int num = 344;
        System.out.println(num++);
        System.out.println(num);

        char v = 'b';
        v++;
        System.out.println(v++);
        System.out.println(v);

    }
    
}
