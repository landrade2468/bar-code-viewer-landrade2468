import javax.swing.*;
import java.awt.*;

/**
 * The class where the barcode is made and placed
 */
public class BarCodeComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        BarCode barcode = new BarCode(45,10);
        barcode.draw(g2);
    }
}
