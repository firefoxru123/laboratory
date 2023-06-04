import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task12 {
    public static void main(String[] args) {
        String[] familyData = {
            "Возраст: 30, Пол: М, Численность семьи: 4, Средний балл: 4.5, Место учебы: Школа №12, Место жительства: улица Пушкина, Количество кружков: 2",
            "Возраст: 25, Пол: Ж, Численность семьи: 3, Средний балл: 4.8, Место учебы: Школа №12, Место жительства: город Москва, Количество кружков: 1",
            // ... add more data strings as needed
        };

        Pattern pattern = Pattern.compile("(квартира|кв\\.|количество|кол-во|улица|ул\\.|город|г\\.)");
        String replacement = "$1.";

        for (String data : familyData) {
            Matcher matcher = pattern.matcher(data);
            String replacedData = matcher.replaceAll(replacement);
            System.out.println("Исходная строка: " + data);
            System.out.println("Измененная строка: " + replacedData);
            System.out.println();
        }
    }
}
