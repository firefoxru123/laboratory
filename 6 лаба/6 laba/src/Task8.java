import java.util.Scanner;

public class Task8 {
    public static double FunctionMy(double a1, double razn) {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += a1;
            a1 += razn;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a1");
        double a1 = (sc.nextInt());
        System.out.println("Введите a5");
        double a5 = sc.nextInt();
        double razn = (a5 - a1) / 4;
        System.out.println(FunctionMy(a1, razn));
    }
}
