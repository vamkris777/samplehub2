package loops.operation;

public class ArrayEg1 {
    public static void main(String[] args) {
        int[] age = {25,24,28,30,18};
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        System.out.println( "Vamshi-" +age[0]);
        System.out.println( "Kalyan-" +age[1]);
        System.out.println( "Rajat-" +age[2]);
        System.out.println( "Ganesh-" +age[3]);
        System.out.println( "Junaith-" +age[4]);
//        forloop
        for(int i=0;i<=7;i++){
           if (i==5) {
//               continue;
                    break;
            }
            System.out.println(num[i]);
        }
//        for each loop
        for (int a:age){
            System.out.println(a);

        }
    }
}
