import java.util.*;

public class task8 {
    public static void vivod (Integer[][] matrix) {
        for (Integer[] integers : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(String.format("%3.0f", (double) integers[j]) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void nol(Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=0;
            }
        }
    }
    public static void block(Integer[][] matrix, int ni, int nj) {
        int N = matrix.length/2, i=ni, j=nj,s=1, tick=0, frwj=1;
        int num=1;
        while (tick!=(N/2)) {
            while (i<(N+ni)-s & j<(N+nj)-s) {
                matrix[i][j]=num;
                i++; j++; num++;
            }
            while (i!=ni-1) {
                matrix[i][j]=num;
                i--; num++;
            }
            s++;
            tick++;
            i=ni;
            j=nj+frwj;
            frwj++;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите чётный порядок матрицы");
        int n = scan.nextInt();
        Integer[][] matrix = new Integer[2*n][2*n];
        nol(matrix);
        block(matrix, 0, 0);
        block(matrix, 0, n);
        block(matrix, n, 0);
        block(matrix, n, n);
        vivod(matrix);
    }
}