public class Task32 {
    public static void main(String[] args) {
        int s = 0, s1, answer = 0;
        for (int i = 1; i < 9; i++) {
            s1 = 1;
            for (int j = 1; j < 4; j++) {
                s = (j * j * j) + (i * i);
                s *= s1;
                System.out.println(s);
                s1 = s;
            }
            answer += s;
        }
        System.out.println("final answer = " + answer);

    }
}