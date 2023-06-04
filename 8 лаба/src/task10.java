public class task10 {
    public static void main(String[] args) {
        double[][] points = {
            {1.5, 2.7, 3.2, 4.8}, // Координаты x
            {2.0, 3.5, 4.0, 5.2}  // Координаты y
        };
        int[] results = checkPointsInRegion(points);
        for (int i = 0; i < results.length; i++) {
            if (results[i] == 1) {
                System.out.println("Точка " + i + " попала внутрь области");
            } else if (results[i] == 0) {
                System.out.println("Точка " + i + " находится на границе области");
            } else {
                System.out.println("Точка " + i + " вне области");
            }
        }
    }
    public static int[] checkPointsInRegion(double[][] points) {
        int n = points[0].length;
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            double x = points[0][i];
            double y = points[1][i];

            if (x >= 1.0 && x <= 4.0 && y >= 2.0 && y <= 5.0) {
                if (x > 1.0 && x < 4.0 && y > 2.0 && y < 5.0) {
                    results[i] = 1;  // Точка внутри области
                } else {
                    results[i] = 0;  // Точка на границе области
                }
            } else {
                results[i] = -1; // Точка вне области
            }
        }
        return results;
    }
}
