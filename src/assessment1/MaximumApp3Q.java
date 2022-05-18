package assessment1;

public class MaximumApp3Q {
    public static void main(String[] args) {
        int[] a = {10,2,3,4,5,6,7,8,9};
        int b=a[0];
        for (int v=1;v<a.length;v++){
            if(a[v]>b){
                b=a[v];
            }
        }
        System.out.println("max number"+b);


    }
}
