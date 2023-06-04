import java.util.Scanner;

public class task6 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Введите размерность матрицы: ");
      int n = input.nextInt();
      int[][] matrix = new int[n][n];
      System.out.println("Введите матрицу: ");
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            matrix[i][j] = input.nextInt();
         }
      }

      int diagonalSum1 = 0, diagonalSum2 = 0;
      for (int i = 0; i < n; i++) {
         diagonalSum1 += matrix[i][i];
         diagonalSum2 += matrix[i][n - 1 - i];
      }

      if (diagonalSum1 != diagonalSum2) {
         System.out.println("Данная матрица не является магическим квадратом.");
         return;
      }

      for (int i = 0; i < n; i++) {
         int rowSum = 0, colSum = 0;

         for (int j = 0; j < n; j++) {
            rowSum += matrix[i][j];
            colSum += matrix[j][i];
         }

         if (rowSum != diagonalSum1 || colSum != diagonalSum1) {
            System.out.println("Данная матрица не является магическим квадратом.");
            return;
         }
      }

      System.out.println("Данная матрица является магическим квадратом.");
   }
}