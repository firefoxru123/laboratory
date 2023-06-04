import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = new int[size][size];
        int counter = 1;
        int i = 0, j = 0;
        while (counter <= size * (size + 1) / 2) {
            matrix[i][j] = counter++;
            if (i == 0 && j < size - 1) {
                i = j + 1;
                j = 0;
            } 
            else {
                i--;
                j++;
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}