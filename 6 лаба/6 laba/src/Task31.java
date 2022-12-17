public class Task31 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (i != j) {
                    s += j * j;
                }
            }
        }
        System.out.println("final answer = " + s);
    }
}