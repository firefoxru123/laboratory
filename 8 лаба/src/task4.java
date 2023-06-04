import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] array1 = {1, 6, 2, 6, 5, 8, 3, 2, 4, 3, 5, 6 ,7 };
        SortPryam(array1);
        int[] array2 = {1, 6, 2, 6, 5, 8, 3, 2, 4, 3, 5, 6 ,7 };
        BubleSort(array2);
    }
    
    public static void SortPryam(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min){
                    pos = j;
                    min = array[j];
                    count += 1;
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        System.out.println("Iterations SortPryam = " + count);
        System.out.println(Arrays.toString(array));
    }
    public static void BubleSort(int[] array){
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++){
                if(array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                    count += 1;
                }
            }
        }
        System.out.println("Iterations BubleSort = " + count);
        System.out.println(Arrays.toString(array));
    }
}
