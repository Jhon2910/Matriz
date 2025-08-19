import java.util.Scanner;

public class jonathan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[][] = new int[3][4];
        int B[][] = new int[4][2];
        int C[][] = new int[3][2];

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                for (int z = 0; j < B.length; z++) {
                    C[i][j] = A[i][j] * B[i][j];
                }
            }

        }

    }
}
