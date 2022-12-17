import static java.lang.Math.*;

class Task4 {
    public static void main(String[] args) {
        double y;
        for (double i = -3; i <= 3; i = i + 0.5) {
            if (i < -3) {
                y = tan(i);
                System.out.println("При x = " + i + ", y = " + y);
            }
            if (i > -3 & i < 3) {
                y = tanh(i);
                System.out.println("При x = " + i + ", y = " + y);
            }
            if (i > 3) {
                y = sqrt(abs(4 - i)) / (2 + pow(i, 2));
                System.out.println("При x = " + i + ", y = " + y);
            }
            if (i == -3 | i == 3) {
                y = PI;
                System.out.println("При x = " + i + ", y = " + y);
            }
        }
    }
}