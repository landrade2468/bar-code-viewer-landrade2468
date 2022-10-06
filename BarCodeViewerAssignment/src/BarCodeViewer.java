import javax.swing.*;

public class BarCodeViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BarCodeComponent component = new BarCodeComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}


