import static java.lang.Math.*;
import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        double g;
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();
        if (x == -3) {
            System.out.println("Данные не подходят по ОДЗ");
        } else if (x <= 0) {
            g = (-3 * pow(x, 2) + log(x + 2)) / abs(9 - pow(x, 2));
            System.out.println(g);
        }
        if (x > 0) {
            g = pow(pow(x, exp(1)) + PI + 2 * x * sin(x) / (cos(2) + pow(x, 2)), 1 / 2);
            System.out.println(g);
        }
    }

    public static void Z(String[] args) {
        double z;
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();
        if (3 * x + exp(1) < 0) {
            System.out.println("Данные не подходят по ОДЗ");
        } else if (x < 0) {
            z = (log(3 * x + exp(1))) / (pow(sin(3 * pow(x, 4)) + pow(exp(1), x), 3));
            System.out.println(z);
        } else if (x > 0 & x < 1) {
            z = 2 * (cos(sin(x)) - tan(sin(x))) * pow(exp(1), -2 * x);
            System.out.println(z);
        } else if (x > 1) {
            z = (2 * sin(3 * x)) / (pow(exp(1), sin(sin(x))) + pow(PI, pow(cos(sin(x)), 2)));
            System.out.println(z);
        }
    }
}