import java.util.Scanner;

class task3 {
    public static void main(String args[]){
        double x, y, l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x1");
        double x1 = sc.nextDouble();
        System.out.println("Введите y1");
        Double y1 = sc.nextDouble();
        System.out.println("Введите x2");
        Double x2 = sc.nextDouble();
        System.out.println("Введите y2");
        Double y2 = sc.nextDouble();
        System.out.println("Введите N1");
        Double N1 = sc.nextDouble();
        System.out.println("Введите N2");
        Double N2 = sc.nextDouble();
        sc.close();
        l = N1/N2;
        x = (x1 + l * x2)/(1+l);
        y = (y1 + l * y2)/(1+l);
        System.out.println("Координаты точки " + x + " : " + y );
    }
}
