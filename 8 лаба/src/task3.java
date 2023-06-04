import java.util.Scanner;

public class task3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        int[] N = {2, 0, 0, -2, 0, 2, -3, 0};
        System.out.println("Введите значение полуосей эллипса для значения A");
        int[] osi = new int[2];
        osi[0] = in.nextInt();
        System.out.println("Введите значение полуосей эллипса для значения B");
        osi[1] = in.nextInt();
        int[] centre = new int[2];
        System.out.println("Введите центр эллипса по X");
        centre[0] = in.nextInt();
        System.out.println("Введите центр эллипса по Y");
        centre[1] = in.nextInt();
        for (int i = 0; i < N.length; i+=2) {
            if ((N[i] - centre[0])/osi[0] + (N[i+1] - centre[1])/osi[1] == 1){
                System.out.println("Точка " + N[i] +"," + N[i+1] + " лежит на границе эллипса");
                count += 1;
            }
        }
        if (count == 0){
            System.out.println("Все точки не лежат на эллипсе");
        }
    }
}