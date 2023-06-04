import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class task3 extends JPanel {
    private double minValue;
    private double maxValue;
    private int width;
    private int height;
    
    public task3(double minValue, double maxValue, int width, int height) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.width = width;
        this.height = height;
        setPreferredSize(new Dimension(width, height));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        // Расчет шага по оси X и масштаба по оси Y
        double step = (maxValue - minValue) / width;
        double scale = height / (maxValue - minValue);
        
        // Построение графика
        for (int i = 0; i < width; i++) {
            double x = minValue + i * step;
            double y = Math.sin(x);  // Замените функцию Math.sin(x) на вашу функцию
            
            int pixelX = i;
            int pixelY = (int) (height - (y - minValue) * scale);
            
            g.drawRect(pixelX, pixelY, 1, 1);
        }
    }
    
    public static void main(String[] args) {
        // Ввод интервала
        double minValue = Double.parseDouble(System.console().readLine("Введите минимальное значение: "));
        double maxValue = Double.parseDouble(System.console().readLine("Введите максимальное значение: "));
        
        // Создание окна с графиком
        int width = 800;
        int height = 600;
        JFrame frame = new JFrame("График функции");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new task3(minValue, maxValue, width, height));
        frame.pack();
        frame.setVisible(true);
    }
}
