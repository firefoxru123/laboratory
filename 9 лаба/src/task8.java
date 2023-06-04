public class task8{
    public static void main(String[] args) {
        String encryptedText = "1 текст 2 котором зашифрованы 3 по следующему принципу";
        String decryptedText = decryptText(encryptedText);
        System.out.println("Расшифрованный текст: " + decryptedText);
    }

    public static String decryptText(String encryptedText) {
        String[] words = encryptedText.split(" ");
        StringBuilder decryptedText = new StringBuilder();

        for (String word : words) {
            if (word.contains("1")) {
                word = word.replace("1", "один");
            } else if (word.contains("2")) {
                word = word.replace("2", "втор");
            } else if (word.contains("3")) {
                word = word.replace("3", "три");
            }
            decryptedText.append(word).append(" ");
        }

        return decryptedText.toString().trim();
    }
}
