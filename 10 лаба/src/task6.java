import java.io.*;

public class task6 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Hacker\\Desktop\\1 курс\\Информатика\\10 лаба\\6t.txt"));
            String line;
            int clinic1Count = 0;
            int clinic2Count = 0;
            int clinic3Count = 0;
            int totalCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                double hourlyRate = Double.parseDouble(data[3]);
                int experience = Integer.parseInt(data[4]);
                if (hourlyRate >= 700 && hourlyRate <= 1400 && experience >= 10) {
                    totalCount++;
                    // Проверка клиники и инкремент соответствующего счетчика
                    String clinic = data[2];
                    if (clinic.equals("Клиника 1")) {
                        clinic1Count++;
                    } else if (clinic.equals("Клиника 2")) {
                        clinic2Count++;
                    } else if (clinic.equals("Клиника 3")) {
                        clinic3Count++;
                    }
                }
            }
            // Дописываем результаты подсчета в конец файла
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Hacker\\Desktop\\1 курс\\Информатика\\10 лаба\\6t.txt", true));
            writer.newLine();
            writer.write("Количество врачей по каждой клинике:");
            writer.newLine();
            writer.write("Клиника 1: " + clinic1Count);
            writer.newLine();
            writer.write("Клиника 2: " + clinic2Count);
            writer.newLine();
            writer.write("Клиника 3: " + clinic3Count);
            writer.newLine();
            writer.write("Общее количество врачей: " + totalCount);
            // Закрываем файлы
            reader.close();
            writer.close();
            System.out.println("Анализ завершен. Результаты записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
