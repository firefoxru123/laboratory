import java.util.Scanner;
import static java.lang.Math.*;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        float x = sc.nextFloat();
        System.out.println("Введите y");
        float y = sc.nextFloat();
        sc.close();
        if (x >= 0 & ((x * x) + (y * y) <= 36)) {
            if (((1 / 3 * x - 4 > y) & (-4 / 3 * x + 1 < y)) | ((x + 1 > y) & (y < 4))) { // треугольники справа
                System.out.println("Un HIT!");
            }
            if (pow(x - 3, 2) + pow(y - 1, 2) < 4) {
                if ((pow(x - 3, 2) + pow(y, 2) < 1) | (pow(x - 3, 2) + pow(y - 2, 2) < 1)) { // круги
                    System.out.println("HIT!");
                } else {
                    System.out.println("Un HIT!");
                }
            } else {
                System.out.println("HIT!");
            }
        }
    }
}
