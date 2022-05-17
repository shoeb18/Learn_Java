
public class _10_Strings {

    public static void main(String[] args) {
        
        //* String in java is object of String class

        String name = "vishal";
        System.out.println(name);

         

        // String methods
        // name = "vishal" --> 0,1,2,3,4,5

        // ye string ka length return karta hai
        System.out.println(name.length());

        // ye string ko lowercase kardeta hai
        System.out.println(name.toLowerCase());

        // ye string ko uppercase mai kardeta hai
        System.out.println(name.toUpperCase());

        // ye string me se spaces delete kardeta hai
        System.out.println(name.trim());

        // ye string ki value print karta hai start and end index value leke
        System.out.println(name.substring(0, 3));
        
        // ye string me se value ko replace kardeta hai
        System.out.println(name.replace('s', 'S'));

        // ye check karta hai kya value isse start ho rahi hai kya nahi
        // agar ho rahi hai to true return karta hai nahito false
        System.out.println(name.startsWith("V"));

        // ye check karta hai kya value isse end ho rahi hai kya nahi
        // agar ho rahi hai to true return karta hai nahito false
        System.out.println(name.endsWith("vishal"));


        // ye string ki index position ki value karta hai
        System.out.println(name.charAt(2));

        // ye string ki index value ki position return karta hai
        System.out.println(name.indexOf('v'));

        // ye check karta hai string match ho rahi hai ya nahi aur boolean return karta hai
        System.out.println(name.equals("Vishal"));
    }
    
}
