import static java.lang.Math.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double s = 0, x = 2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Write number n : ");
        Integer n = sc.nextInt();
        sc.close();
        for (int i = 1; i < n + 1; i++) {
            s = s + pow(x, 2 * i - 1) / (2 * i - 1);
        }
        System.out.println("Sum first n number`s = " + s);
    }
}