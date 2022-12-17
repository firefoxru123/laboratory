import static java.lang.Math.*;
import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        double sinn, coss, lnn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        Double x = sc.nextDouble();
        sinn = Math.sin(x);
        coss = cos(x) / x;
        lnn = Math.log(x);
        sc.close();
        double[] array = { sinn, coss, lnn };
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void swap(double[] array, int ind1, int ind2) {
        double tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
