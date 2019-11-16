package grafistext;
import java.awt.*;
public class Grafistext extends Panel {
    Font f;
    String text = "HALO KHARISMA";
    Grafistext() {
        setBackground(Color.GRAY); // Konstanta dalam class Color
    }
    public void paint(Graphics g) {
        f = new Font("Helvetica", Font.BOLD,48);
        // Kotak hijau
        g.setColor(Color.GREEN);
        g.fillRect(8, 8, 335, 105);
        // Warna hitam pinggiran
        g.setColor(Color.BLACK);
        g.drawRect(8, 8, 335, 105);
        g.setColor(Color.PINK);
        g.fillOval(10, 10, 330, 100);
        // Diberi pinggiran warna merah tebal (3x)
        g.setColor(Color.RED);
        g.drawOval(10, 10, 330, 100);
        g.drawOval(9, 9, 332, 102);
        g.drawOval(8, 8, 334, 104);
        // Tulisan warna hitam dengan font helvetica
        g.setColor(Color.BLACK);
        g.setFont(f);
        g.drawString(text, 40, 75);
    }
    public static void main(String[] args) {
        Frame f = new Frame("Testing Graphics Panel");
        Grafistext gp = new Grafistext();
        f.add(gp);
        f.setSize(900, 900);
        f.setVisible(true);
    }
}
