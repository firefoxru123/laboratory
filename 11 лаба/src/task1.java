import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class task1 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;

    public task1() {
        setTitle("File Write");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание компонентов
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel label1 = new JLabel("Введите текст (максимум 25 символов):");
        panel.add(label1);

        textField1 = new JTextField(25);
        panel.add(textField1);

        JLabel label2 = new JLabel("Укажите путь к файлу:");
        panel.add(label2);

        textField2 = new JTextField();
        panel.add(textField2);

        JButton button = new JButton("Записать в файл");
        button.addActionListener(new ButtonListener());
        panel.add(button);

        add(panel);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String text = textField1.getText();
            String filePath = textField2.getText();

            try {
                FileWriter fileWriter = new FileWriter(filePath);
                fileWriter.write(text);
                fileWriter.close();
                JOptionPane.showMessageDialog(task1.this,
                        "Данные успешно записаны в файл.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(task1.this,
                        "Ошибка при записи данных в файл: " + e.getMessage(),
                        "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new task1();
            }
        });
    }
}
