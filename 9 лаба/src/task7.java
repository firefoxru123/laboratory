import java.util.regex.*;

public class task7 {
    public static void main(String[] args) {
        String sentence = "Встречаемся в ООО «Кнопка» завтра в 10:00.";

        // Используем регулярное выражение для поиска названий фирм
        String regex = "\\bООО\\s+«[^»]+»";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        // Заменяем найденные названия фирм на слово "фирма"
        String result = matcher.replaceAll("фирма");

        System.out.println(result);
    }
}
