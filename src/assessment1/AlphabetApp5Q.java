package assessment1;

public class AlphabetApp5Q {
    public static void main(String[] args) {
        String v = "vamshi";
        char[] ch= v.toCharArray();
        for (char ch1:ch) {
            if ((ch1 == 'a') || (ch1 == 'e') || (ch1 == 'i') || (ch1 == 'o') || (ch1 == 'u')) {
                System.out.println(ch1+"  is vowel");
            }
            else{
                System.out.println(ch1+"  is consonant");
            }
        }
    }
}