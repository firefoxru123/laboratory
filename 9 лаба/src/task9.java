public class task9{
    public static void main(String[] args) {
        String text = "Это текст с комментариями.\n" +
                "ООО Это комментарий, который должен быть удален.\n" +
                "Это обычная строка текста.\n" +
                "ААА Этот комментарий также нужно удалить.\n" +
                "Это еще одна строка текста.\n" +
                "БББ И этот комментарий тоже нужно удалить.";
        String result = removeComments(text);
        if (result.isEmpty()) {
            System.out.println("Комментарии не найдены.");
        } else {
            System.out.println(result);
        }
    }
    public static String removeComments(String text) {
        String[] lines = text.split("\n");
        StringBuilder resultBuilder = new StringBuilder();
        for (String line : lines) {
            if (!line.startsWith("ООО") && !line.startsWith("ААА") && !line.startsWith("БББ")) {
                resultBuilder.append(line).append("\n");
            }
        }
        return resultBuilder.toString().trim();
    }
}
