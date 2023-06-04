public class task1 {
    public static void main(String[] args) {
        char[][] matrix = {
            {'+', '+', '-', '*', '+', '*'},
            {'*', '-', '+', '*', '-', '+'}
        };
        int plusCount = 0;
        int minusCount = 0;
        int starCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '+') {
                    plusCount++;
                } else if (matrix[i][j] == '-') {
                    minusCount++;
                } else if (matrix[i][j] == '*') {
                    starCount++;
                }
            }
        }
        System.out.println("Количество символов '+': " + plusCount);
        System.out.println("Количество символов '-': " + minusCount);
        System.out.println("Количество символов '*': " + starCount);
    }
}
