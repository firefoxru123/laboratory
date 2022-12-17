import static java.lang.Math.*;
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        double min, max, curlength;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x1");
        Integer x1 = sc.nextInt();
        System.out.println("Введите y1");
        Integer y1 = sc.nextInt();
        System.out.println("Введите x2");
        Integer x2 = sc.nextInt();
        System.out.println("Введите y2");
        Integer y2 = sc.nextInt();
        System.out.println("Введите x3");
        Integer x3 = sc.nextInt();
        System.out.println("Введите y3");
        Integer y3 = sc.nextInt();
        System.out.println("Введите x4");
        Integer x4 = sc.nextInt();
        System.out.println("Введите y4");
        Integer y4 = sc.nextInt();
        sc.close();
        curlength = length(x1, y1, x2, y2);
        max = curlength;
        min = curlength;
        curlength = length(x1, y1, x3, y3);
        if (max < curlength) {
            max = curlength;
        }
        if (min > curlength) {
            min = curlength;
        }
        curlength = length(x1, y1, x4, y4);
        if (max < curlength) {
            max = curlength;
        }
        if (min > curlength) {
            min = curlength;
        }
        curlength = length(x2, y2, x3, y3);
        if (max < curlength) {
            max = curlength;
        }
        if (min > curlength) {
            min = curlength;
        }
        curlength = length(x2, y2, x4, y4);
        if (max < curlength) {
            max = curlength;
        }
        if (min > curlength) {
            min = curlength;
        }
        curlength = length(x3, y3, x4, y4);
        if (max < curlength) {
            max = curlength;
        }
        if (min > curlength) {
            min = curlength;
        }
        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение = " + min);
    }

    public static double length(int x1, int y1, int x2, int y2) {
        return sqrt((pow(x2 - x1, 2) + pow(y2 - y1, 2)));
    }

}