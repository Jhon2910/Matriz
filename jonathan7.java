import java.util.Scanner;
import java.util.Random;

public class jonathan7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int n;

        System.out.println("Digite a dimensao: ");
        n = sc.nextInt();

        int matriz[][] = new int[n][n];
        int linha[] = new int[n];
        int coluna[] = new int[n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o numero: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                linha[i] += matriz[i][j];
                coluna[j] += matriz[j][i];
            }
        }

        for (int i = 0; i < matriz.length;i++){
            if (linha[i] != 1 || coluna[i] != 1){
                System.out.println("nao e uma matriz permutacao.");
                return;
            }
        }

        System.out.println("e uma matriz permutação.");
    }
}
