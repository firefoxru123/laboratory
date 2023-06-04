import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task5{
    public static void main(String[] args) {
        String input = "ABC FCB SAF SAFASFASKJ FKSAJF FKASJF JASKFJFIQ QWE EW TR";
        int count = countAbbreviations(input);
        System.out.println("Количество аббревиатур: " + count);
    }
    public static int countAbbreviations(String input) {
        // Регулярное выражение для поиска аббревиатур
        String regex = "\\b[A-Z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
