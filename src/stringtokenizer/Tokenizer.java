package stringtokenizer;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        StringTokenizer tokenizer= new StringTokenizer("He: is: a: rider",":");
        System.out.println("tokenizer"+tokenizer);
        while(tokenizer.hasMoreElements()) {
            String token=tokenizer.nextToken();
            if(token.equalsIgnoreCase("a")){
                continue;
            }
            System.out.println(token);



        }
    }
}
