public class Task33 {
    public static void main(String[] args) {
        int s = 0, s1, answer = 0;
        for (int i = 1; i < 9; i++) {
            s1 = 1;
            for (int j = 1; j < i + 1; j++) {
                s1 = 1;
                for (int k = i; k < j + 1; k++) {
                    s = j * j + i - 2 * k;
                    s += s1;
                    s1 = s;
                }
                answer += s;
            }
            answer += s;
        }
        System.out.println("final answer = " + answer);
    }
}