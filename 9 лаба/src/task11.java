import java.util.Arrays;

public class task11 {
    public static void main(String[] args) {
        String[] array = {"hello123", "world456", "java789"};
        // Регулярное выражение 1: Заменить все цифры на пустую строку
        String regex1 = "\\d";
        String[] formattedArray1 = formatArray(array, regex1);
        System.out.println("Formatted Array 1: " + Arrays.toString(formattedArray1));
        // Регулярное выражение 2: Заменить все буквы на символ 'X'
        String regex2 = "[a-zA-Z]";
        String[] formattedArray2 = formatArray(array, regex2);
        System.out.println("Formatted Array 2: " + Arrays.toString(formattedArray2));
        // Регулярное выражение 3: Удалить все символы, кроме букв и цифр
        String regex3 = "[^a-zA-Z0-9]";
        String[] formattedArray3 = formatArray(array, regex3);
        System.out.println("Formatted Array 3: " + Arrays.toString(formattedArray3));
    }
    public static String[] formatArray(String[] array, String regex) {
        String[] formattedArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            formattedArray[i] = array[i].replaceAll(regex, "");
        }
        return formattedArray;
    }
}
