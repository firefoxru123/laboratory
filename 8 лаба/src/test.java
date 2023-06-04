import java.util.Random;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        System.out.println("Заполнить массив полностью нажмите-1, заполнить по блокам - 2");
        int vibor = sc.nextInt();
        if (vibor == 1){
            vibor1(n);
        }
        if (vibor == 2){
            vibor2(n);
        }
    }
    public static void vibor1( int n){
        int mas[][] = new int[n][n];
        Random run = new Random();
        for (int i = 0; i < (n)  ; i++) {
            for (int j = 0; j < (n)  ; j++) {
                mas[i][j] = run.nextInt(20);
            }
        }
        G(mas);
    }
    public static void vibor2(int n) {
        int mas[][] = new int[2 * n][2 * n];
        Random run = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = run.nextInt(20);
            }
        }

        for (int i = n; i < (2 * n); i++) {
            for (int j = n; j < (2 * n); j++) {
                mas[i][j] = run.nextInt(20);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = n; j < (2 * n); j++) {
                mas[i][j] = run.nextInt(20);
            }
        }

        for (int i = n; i < (2 * n); i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = run.nextInt(20);
            }
        }

        G(mas);
    }

    public static void G(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
