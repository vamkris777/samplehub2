package string;

import java.util.Scanner;

public class InsertDoubt {
    public static void main(String[] args) {
        Scanner vam= new Scanner(System.in);
        System.out.println("enter a string");
        String kris1=vam.nextLine();
        StringBuffer kris= new StringBuffer(kris1);

        System.out.println(kris.length());
        //insert
        //System.out.println(kris.insert(1 ,"a"));
        System.out.println(kris.replace(2,4,"a"));
        //
        System.out.println(kris.insert(3,0.04));
        System.out.println(kris.delete(3,7));

    }
}
