public class task5 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 4}, {5, 6, 7, 8}, {9, 13, 10, 10}, {11, 12, 13, 14}};
        int maxCount = 0;
        int maxRowIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int count = 1;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] == matrix[i][j+1]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxRowIndex = i + 1;
                }
            }
        }
        System.out.println("Номер строки с максимальным количеством одинаковых элементов: " + maxRowIndex);
    }
}
