public class Task7 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int n = 1; n < 10; n++) {
                System.out.print(i + "x" + n + "=" + n * i + ' ');
            }
            System.out.println();
        }
    }
}