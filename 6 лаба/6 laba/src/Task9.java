import java.util.*;
import static java.lang.Math.*;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        double x = (in.nextDouble());
        System.out.println("Введите p");
        double p = (in.nextDouble());
        double y = log(x * (p + 1)) / p;
        int c = 0;
        for (double e = pow(10, -1); e > pow(10, -6); e *= 0.1) {
            while (true) {
                double ly = y;
                y = 1 / p * ((p - 1) * y + x / pow(y, (p - 1)));
                c++;
                if (abs(y - ly) < e) {
                    System.out.println("Точность: " + e + "\nКорень: " + y
                            + "\nЧисло итераций: " + c + "\n");
                    break;
                }
            }
        }
    }
}
