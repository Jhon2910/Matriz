import java.util.Scanner;
import java.util.Random;

public class jonathan6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();

        double matriz[][] = new double[4][7];
        double menor = Double.MAX_VALUE;
        int linhaM = 0;
        double MINMAX = Double.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextDouble(101);
                if ((i == 0 && j == 0) || matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linhaM = i;
                }
            }
        }

        for (int j = 0; j < matriz[0].length; j++) {
            if (matriz[linhaM][j] > MINMAX) {
                MINMAX = matriz[linhaM][j];
            }
        }
        System.out.print(MINMAX);
    }
}
