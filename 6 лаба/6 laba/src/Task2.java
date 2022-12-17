import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int hour = 0, minutes = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Write quantity bacteries on start : ");
        Integer n = sc.nextInt();
        System.out.print("Write quantity bacteries on before time : ");
        Long s = sc.nextLong();
        sc.close();
        while (s > n) {
            s = s / 2;
            minutes += 1;
        }
        while (minutes > 60) {
            hour += 1;
            minutes = minutes - 60;
        }
        System.out.println("Quantity hours = " + hour);
        System.out.println("Quantity minutes = " + minutes);
    }
}