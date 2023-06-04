import java.util.Scanner;

public class task12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();
        double[][] coefficients = new double[size][size];
        double[] rightSide = new double[size];
        System.out.println("Введите коэффициенты системы уравнений:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                coefficients[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Введите столбец правой части:");
        for (int i = 0; i < size; i++) {
            System.out.print("F[" + i + "]: ");
            rightSide[i] = scanner.nextDouble();
        }
        System.out.println("Введите столбец полученного решения:");
        double[] solution = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("X[" + i + "]: ");
            solution[i] = scanner.nextDouble();
        }
        boolean solutionMatches = checkSolution(coefficients, rightSide, solution);
        if (solutionMatches) {
            System.out.println("Решение соответствует СЛАУ.");
        } else {
            System.out.println("Решение не соответствует СЛАУ.");
        }
    }
    private static boolean checkSolution(double[][] coefficients, double[] rightSide, double[] solution) {
        int size = coefficients.length;
        for (int i = 0; i < size; i++) {
            double sum = 0;
            for (int j = 0; j < size; j++) {
                sum += coefficients[i][j] * solution[j];
            }
            if (sum != rightSide[i]) {
                return false;
            }
        }
        return true;
    }
}
