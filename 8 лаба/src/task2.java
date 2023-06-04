public class task2{
    public static void main(String[] args) {
        double p;int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] y = new double[10];
        for(int i = 0; i < 10; i++){y[i] = x[i] * x[i] + 0.3;}
        p = x[1]*y[1]*x[3]*y[3]*x[5]*y[5]*x[7]*y[7]*x[9]*y[9]/(x[0]*y[0]*x[2]*y[2]*x[4]*y[4]*x[6]*y[6]*x[8]*y[8]);
        System.out.println(p);
    }
}