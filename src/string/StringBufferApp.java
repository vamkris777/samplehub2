package string;

public class StringBufferApp {
    public static void main(String[] args) {
        String str="Write stringBuffer Program ";
        StringBuffer vam = new StringBuffer(str);
       // System.out.println(vam.);
        //length
        System.out.println(vam.length());
        //replace
        System.out.println(vam.replace(26,28,"s "));
        //append
        System.out.println(vam.append("application"));
        //capacity
        System.out.println(vam.capacity());
        //charAt
        System.out.println(vam.charAt(10));
        //index no
        System.out.println(vam.indexOf("s"));
        //insert
        System.out.println(vam.insert(26,"s"));
        //delete
        System.out.println(vam.delete(6,12));
        //reverse
        System.out.println(vam.reverse());








    }
}
