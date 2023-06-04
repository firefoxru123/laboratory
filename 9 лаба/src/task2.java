import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidInput = false;
        String inputHexNumber;
        while (!isValidInput) {
            System.out.print("Введите число в 16-ой системе счисления: ");
            inputHexNumber = scanner.nextLine().toUpperCase(); // Преобразуем введенную строку в верхний регистр
            if (inputHexNumber.matches("[0-9A-F]+")) {
                isValidInput = true;
                String base5Number = convertHexToBase5(inputHexNumber);
                System.out.println("Число в 5-ой системе счисления: " + base5Number);
            } else {
                System.out.println("Неверный ввод. Введите число в 16-ой системе счисления.");
            }
        }
    }
    private static String convertHexToBase5(String hexNumber) {
        int decimalNumber = Integer.parseInt(hexNumber, 16); // Переводим число из 16-ой системы в десятичную
        StringBuilder base5Number = new StringBuilder();
        while (decimalNumber > 0) {
            base5Number.insert(0, decimalNumber % 5); // Получаем остаток от деления на 5 и добавляем его в начало строки
            decimalNumber /= 5; // Делаем целочисленное деление на 5
        }
        return base5Number.toString();
    }
}
