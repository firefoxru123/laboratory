import java.util.*;
import static java.lang.Math.*;

public class Task6 {
    public static boolean oblast(double x, double y) {
        if (pow(x, 2) + pow(y, 2) <= 36 & x >= 0 & !(y <= 4 & y >= x + 1) &
                !(y <= -4f / 3 * x + 1 & y >= 1f / 3 * x - 4) & !(pow(x - 4, 2) + pow(y + 2, 2) <= 1) &
                !((pow(x - 3, 2) + pow(y - 1, 2) <= 4) & !(pow(x - 2, 2) + pow(y - 1, 2) <= 1))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        double x = 0, y = 0;
        Scanner in = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("Введите \"stop\", если хотите прекратить поиск координат.");
            String vvod = in.nextLine();
            if (vvod.equals("stop")) {
                stop = true;
            } else {
                System.out.println("Введите координаты х");
                x = Double.parseDouble(in.nextLine());
                System.out.println("Введите координаты y");
                y = Double.parseDouble(in.nextLine());
                if (oblast(x, y)) {
                    System.out.println("Точка попала в область");
                } else {
                    System.out.println("Точка не попала в область");
                }
            }
        }
    }
}
