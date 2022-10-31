import java.util.Scanner;

class task2 {
    public static void main(String args[]){
        double time, kmA;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние между точками A и B");
        double L = sc.nextDouble();
        System.out.println("Скорость первого тела");
        double v1 = sc.nextDouble();
        System.out.println("Скорость второго тела");
        double v2 = sc.nextDouble();
        sc.close();
        time = L/(v1 + v2);
        kmA = v1*time;
        System.out.println("Время встречи =" + time);
        System.out.println("Расстояние от точки А =" + kmA);
	}
}
