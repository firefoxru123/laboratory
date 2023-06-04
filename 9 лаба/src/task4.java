import java.util.ArrayList;

public class task4 {
    public static void main(String[] args) {
        char[][] matrix = {
            {'3', '*', '(', '4', '-', '2', '*', '2', ')', '=', '6'},
            {'2', '*', '(', '7', '-', '2', '*', '3', ')', '=', '8'},
            {'1', '*', '(', '5', '-', '2', '*', '2', ')', '=', '3'}
        };
        ArrayList<String> incorrectExpressions = new ArrayList<>();
        int correctCount = 0;
        // Проверка выражений по строкам
        for (int row = 0; row < matrix.length; row++) {
            String expression = new String(matrix[row]);
            int result = evaluateExpression(expression);
            if (result != -1) {
                correctCount++;
            } else {
                incorrectExpressions.add(expression);
            }
        }
        // Проверка выражений по столбцам
        for (int col = 0; col < matrix.length; col++) {
            StringBuilder expressionBuilder = new StringBuilder();
            for (int row = 0; row < matrix.length; row++) {
                expressionBuilder.append(matrix[row][col]);
            }
            String expression = expressionBuilder.toString();
            int result = evaluateExpression(expression);
            if (result != -1) {
                correctCount++;
            } else {
                incorrectExpressions.add(expression);
            }
        }
        // Вывод информации
        System.out.println("Количество правильно вычисленных выражений: " + correctCount);
        System.out.println("Неправильно вычисленные выражения:");
        for (String incorrectExpression : incorrectExpressions) {
            System.out.println(incorrectExpression);
        }
    }
    private static int evaluateExpression(String expression) {
        String[] parts = expression.split("=");
        if (parts.length != 2) {
            return -1;
        }
        String left = parts[0].trim();
        String right = parts[1].trim();
        if (left.matches("\\d+") && right.matches("\\d+")) {
            int leftValue = Integer.parseInt(left);
            int rightValue = Integer.parseInt(right);
            if (leftValue == 3 * (rightValue - 2 * rightValue)) {
                return leftValue;
            }
        }
        return -1;
    }
}
