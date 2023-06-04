import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите массив символов: ");
        String input = scanner.nextLine();
        char[] characters = input.toCharArray();
        // а) Определить количество строчных латинских букв
        int lowercaseCount = 0;
        for (char c : characters) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }
        System.out.println("Количество строчных латинских букв: " + lowercaseCount);
        // б) Выяснить, входит ли в последовательность хотя бы 1 символ слова, введенного с клавиатуры
        System.out.print("Введите слово для проверки: ");
        String word = scanner.nextLine();
        boolean containsWord = input.contains(word);
        int wordCount = containsWord ? input.split(word, -1).length - 1 : 0;
        System.out.println("Слово \"" + word + "\" встречается " + wordCount + " раз");
        
        // в) Выяснить, верно ли, что среди символов имеются точки, запятые и многоточия
        boolean containsPunctuation = false;
        for (char c : characters) {
            if (c == '.' || c == ',' || c == '…') {
                containsPunctuation = true;
                break;
            }
        }
        System.out.println("Среди символов " + (containsPunctuation ? "есть" : "нет") + " точки, запятой или многоточия");
        
        // г) Выяснить, имеется ли среди символов пара соседствующих скобок "(", ")", "{", "}", "[", "]"
        boolean containsBrackets = false;
        for (int i = 0; i < characters.length - 1; i++) {
            char current = characters[i];
            char next = characters[i + 1];
            if ((current == '(' && next == ')') ||
                    (current == '{' && next == '}') ||
                    (current == '[' && next == ']')) {
                containsBrackets = true;
                break;
            }
        }
        System.out.println("Среди символов " + (containsBrackets ? "есть" : "нет") + " пара соседствующих скобок");
        
        // д) Выяснить, имеется ли среди символов пара соседствующих одинаковых символов, относящихся к знакам препинания
        boolean containsDuplicatePunctuation = false;
        for (int i = 0; i < characters.length - 1; i++) {
            char current = characters[i];
            char next = characters[i + 1];
            if (Character.getType(current) == Character.getType(next)) {
                containsDuplicatePunctuation = true;
                break;
            }
        }
        System.out.println("Среди символов " + (containsDuplicatePunctuation ? "есть" : "нет") +
                " пара соседствующих одинаковых символов, относящихся к знакам препинания");
        
        // е) Выяснить, верно ли, что существуют такие натуральные i и j, что i < k < j < п и что si, si+1, sk, sj, sj+1 цифры,
        // si, si+1 больше sk, a sj, sj+1 меньше, чем sk
        boolean satisfiesCondition = false;
        for (int i = 0; i < characters.length - 4; i++) {
            if (Character.isDigit(characters[i]) && Character.isDigit(characters[i + 1])) {
                int si = Character.getNumericValue(characters[i]);
                int siPlus1 = Character.getNumericValue(characters[i + 1]);
                for (int k = i + 2; k < characters.length - 2; k++) {
                    if (Character.isDigit(characters[k])) {
                        int sk = Character.getNumericValue(characters[k]);
                        if (si > sk) {
                            for (int j = k + 2; j < characters.length - 1; j++) {
                                if (Character.isDigit(characters[j]) && Character.isDigit(characters[j + 1])) {
                                    int sj = Character.getNumericValue(characters[j]);
                                    int sjPlus1 = Character.getNumericValue(characters[j + 1]);
                                    if (siPlus1 > sk && sj < sk && si < k && k < j) {
                                        satisfiesCondition = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (satisfiesCondition) {
                        break;
                    }
                }
            }
            if (satisfiesCondition) {
                break;
            }
        }
        System.out.println("Условие существования таких i, k, j удовлетворяется: " + satisfiesCondition);
    }
}
