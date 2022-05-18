package string;

import java.util.Locale;

public class StringEqual {
    public static void main(String[] args) {
        String str1 = new String("Vamshi");
        String str2 = "Vamshi";
        String str3 = "kris is a Biker";
        //Equal case
        System.out.println("Comparing Two strings::"+str1.equals(str2));
        // Comparison
        System.out.println("Comparing Two Strings::"+(str1==str2) );
        // Equal Ignore case
        System.out.println("Comparing Two strings::"+str1.equalsIgnoreCase(str2));
        //Lower case
        System.out.println("string in lower case ::"+str3.toLowerCase());
        // Upper case
        System.out.println("string in upper case ::"+str3.toUpperCase());
        // Concatenation
        System.out.println(str1 + " " + str3);
        // Contact
        System.out.println(str1.concat(str3));



    }
}
