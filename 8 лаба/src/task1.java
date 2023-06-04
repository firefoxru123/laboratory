import java.util.Scanner;

public class task1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "";
        System.out.println("Введите размерность массива N");
        int N = in.nextInt();
        int[] numbers = new int[N];
        System.out.println("Введите первое число оно должно быть от 1 до 3");
        numbers[0] = in.nextInt();
        while (numbers[0] > 3 | numbers[0] < 0) {
            System.out.println("Вы ввели число больше 3 или меньше 1");
            System.out.println("Введите число от 1 до 3");
            numbers[0] = in.nextInt();
        }
        for (int i = 1; i < N; i++) {
            System.out.println("Введите число от 0 до 3");
            numbers[i] = in.nextInt();
            if (numbers[i] > 3 | numbers[i] < 0) {
                System.out.println("Вы ввели число больше 3 или меньше 0");
                System.out.println("Введите число от 0 до 3");
                numbers[i] = in.nextInt();
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            str = str + numbers[i];
        }
        int decimal = Integer.parseInt(str, 4);
        String output = Integer.toString(decimal, 10);
        System.out.println(output);
    }
}