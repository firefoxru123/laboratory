import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class task2 extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField middleNameField;
    private JTextField birthDateField;
    private JTextField groupField;

    public task2() {
        setTitle("Запись и чтение данных");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JLabel firstNameLabel = new JLabel("Имя:");
        firstNameField = new JTextField();
        JLabel lastNameLabel = new JLabel("Фамилия:");
        lastNameField = new JTextField();
        JLabel middleNameLabel = new JLabel("Отчество:");
        middleNameField = new JTextField();
        JLabel birthDateLabel = new JLabel("Дата рождения:");
        birthDateField = new JTextField();
        JLabel groupLabel = new JLabel("Учебная группа:");
        groupField = new JTextField();

        JButton saveButton = new JButton("Записать");
        JButton loadButton = new JButton("Загрузить");

        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(middleNameLabel);
        panel.add(middleNameField);
        panel.add(birthDateLabel);
        panel.add(birthDateField);
        panel.add(groupLabel);
        panel.add(groupField);
        panel.add(saveButton);
        panel.add(loadButton);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveDataToFile();
            }
        });

        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadDataFromFile();
            }
        });

        add(panel);
        setVisible(true);
    }

    private void saveDataToFile() {
        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write(firstNameField.getText() + "\n");
            writer.write(lastNameField.getText() + "\n");
            writer.write(middleNameField.getText() + "\n");
            writer.write(birthDateField.getText() + "\n");
            writer.write(groupField.getText() + "\n");
            writer.close();
            JOptionPane.showMessageDialog(this, "Данные успешно записаны в файл.");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ошибка при записи данных в файл.");
        }
    }

    private void loadDataFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            firstNameField.setText(reader.readLine());
            lastNameField.setText(reader.readLine());
            middleNameField.setText(reader.readLine());
            birthDateField.setText(reader.readLine());
            groupField.setText(reader.readLine());
            reader.close();
            JOptionPane.showMessageDialog(this, "Данные успешно загружены из файла.");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ошибка при чтении данных из файла.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new task2();
            }
        });
    }
}
