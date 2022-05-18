package assessment1;

public class MatrixApp4Q {
    public static void main(String[] args) {
        int[][] v = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("length size= " + v.length);
        // For Row
        for (int k = 0; k < v.length; k++) {
            // For col
            for (int r = 0; r < v.length; r++) {
                System.out.print(" " + v[k][r]);
            }
            System.out.println();

        }
    }
}
