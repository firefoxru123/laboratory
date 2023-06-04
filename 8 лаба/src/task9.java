import java.util.*;

public class task9 {
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
    public static void odin(Integer[][] matrix, int ni, int nj) {
        int N = matrix.length/2, s=1, i=ni, j=nj, frwi=1;
        int num=1;
        for (int k=0; k<N/2; k++) {
            while (j<(N+nj)-s) {
                matrix[i][j] = num;
                j++;
                num++;
            }
            if (j==(N+nj)-s){
                while (i<(N+ni)-s){
                    matrix[i][j]=num;
                    i++;num++;
                }
            }
            while (j!=nj-1){
                matrix[i][j]=num;
                j--;num++;
            }
            s++;
            i=ni+frwi;
            j=nj;
            frwi++;
        }
    }
    public static void dva(Integer[][] matrix, int ni, int nj) {
        int N = matrix.length/2, s=1, i=ni, j=nj, frwi=1;
        int num=1;

        for (int k=0; k<N/2; k++) {
            while (i<(N+ni)-s) {
                matrix[i][j] = num;
                i++;
                num++;
            }

            if (i==(N+ni)-s){
                while (j<(N+nj)-s){
                    matrix[i][j]=num;
                    j++;num++;
                }
            }
            while (i!=ni-1){
                matrix[i][j]=num;
                i--;num++;
            }
            s++;
            j=nj+frwi;
            i=ni;
            frwi++;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите чётный порядок матрицы");
        int n = scan.nextInt();
        Integer[][] matrix = new Integer[2*n][2*n];
        nol(matrix);
        odin(matrix, 0, 0);
        dva(matrix, 0, n);
        dva(matrix, n, 0);
        odin(matrix, n, n);
        vivod(matrix);
    }
}