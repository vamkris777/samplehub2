package loops.operation;

public class ArrayEg {
    public static void main(String[] args) {
        int[] a={ 1,2,3,4,5,6,7,8,9};
        for (int i=0;i<=6;i++){
            System.out.println(a[i]);
        }
        int[] b={ 6,7,8,9};
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
//            break;
            continue;
        }
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
            break;
        }

    }
}
