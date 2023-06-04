import java.util.Scanner;

public class task11 {
    private static final int NUM_OF_PROPERTIES = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество предполагаемых четырехугольников (N): ");
        int numOfQuadrilaterals = scanner.nextInt();
        int[][] coordinates = new int[2 * NUM_OF_PROPERTIES][4 * numOfQuadrilaterals];
        System.out.println("Введите координаты вершин четырехугольников:");
        for (int i = 0; i < 2 * NUM_OF_PROPERTIES; i++) {
            for (int j = 0; j < 4 * numOfQuadrilaterals; j++) {
                coordinates[i][j] = scanner.nextInt();
            }
        }
        int[][] results = analyzeQuadrilaterals(coordinates);
        displayResults(results, numOfQuadrilaterals);
    }
    private static int[][] analyzeQuadrilaterals(int[][] coordinates) {
        int numOfQuadrilaterals = coordinates[0].length / 4;
        int[][] results = new int[NUM_OF_PROPERTIES][numOfQuadrilaterals];
        for (int i = 0; i < numOfQuadrilaterals; i++) {
            int[][] currentQuadrilateral = extractQuadrilateral(coordinates, i);
            results[0][i] = isValidQuadrilateral(currentQuadrilateral) ? 1 : 0;
            results[1][i] = classifyQuadrilateral(currentQuadrilateral);
            results[2][i] = calculateArea(currentQuadrilateral);
            results[3][i] = canBeInscribed(currentQuadrilateral) ? 1 : -1;
        }
        return results;
    }
    private static int[][] extractQuadrilateral(int[][] coordinates, int index) {
        int[][] quadrilateral = new int[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                quadrilateral[i][j] = coordinates[i * NUM_OF_PROPERTIES][index * 4 + j];
            }
        }
        return quadrilateral;
    }
    private static boolean isValidQuadrilateral(int[][] quadrilateral) {
        // Проверка условий, что все стороны не вырождены и сумма углов равна 360 градусов
        // Реализуйте эту проверку в соответствии с требованиями вашей задачи

        return true; // Заглушка, всегда возвращает true
    }
    private static int classifyQuadrilateral(int[][] quadrilateral) {
        // Классификация четырехугольника
        // Реализуйте эту классификацию в соответствии с требованиями вашей задачи

        return 5; // Заглушка, всегда возвращает 5
    }
    private static int calculateArea(int[][] quadrilateral) {
        // Вычисление площади четырехугольника
        // Реализуйте этот расчет в соответствии с требованиями вашей задачи
        return 0; // Заглушка, всегда возвращает 0
    }
    private static boolean canBeInscribed(int[][] quadrilateral) {
        // Проверка возможности вписать четырехугольник в окружность
        // Реализуйте эту проверку в соответствии с требованиями вашей задачи

        return true;
    }
    private static void displayResults(int[][] results, int numOfQuadrilaterals) {
        System.out.println("\nРезультаты анализа:");
        for (int i = 0; i < NUM_OF_PROPERTIES; i++) {
            switch (i) {
                case 0:
                    System.out.println("Существование четырехугольника:");
                    break;
                case 1:
                    System.out.println("Классификация четырехугольников:");
                    break;
                case 2:
                    System.out.println("Площадь четырехугольников:");
                    break;
                case 3:
                    System.out.println("Возможность вписать четырехугольник в окружность:");
                    break;
            }
            for (int j = 0; j < numOfQuadrilaterals; j++) {
                System.out.print(results[i][j] + " ");
            }
            System.out.println();
        }
    }
}
