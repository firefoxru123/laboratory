import static java.lang.Math.*;

class Task3{
    public static void main(String[] args) {
        double f;
        for (double i = -3; i <= 3; i = i + 0.5){
            if (i>= 0){
                f = 2 * (i * i - 5) - i;
                System.out.println("При i = " + i + ", f = " + f%4.);
            }
            else{
                f = tan(i);
                System.out.println("При i = " + i + ", f = " + f%4.f);
            }
        }
    }
}
