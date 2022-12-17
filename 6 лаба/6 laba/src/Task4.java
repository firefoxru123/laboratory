import java.util.*;

public class Task4 {
    public static double perevod(double x, int s) {
        int xc = (int) x;
        double xd = x - xc;
        String x1 = "", x2 = "0.";
        while (xc > 0) {
            x1 += Integer.toString(xc % s);
            xc /= s;
        }
        for (int a = 0; a < 10; a++) {
            xd = xd * s - (int) xd * s;
            x2 += Integer.toString((int) xd);
        }
        return Integer.parseInt(new StringBuilder(x1).reverse().toString())
                + Double.parseDouble(new StringBuilder(x2).toString());
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дробное число");
        double a = in.nextDouble();
        int s = 0;
        while (s < 1 | s > 10) {
            System.out.println("Введите систему счисления (1<=s<=10)");
            s = in.nextInt();
        }
        System.out.println(perevod(a, s));
    }
}
