package texttengah;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Panel;
public class TextTengah extends Panel {
    TextTengah() {
        setBackground(Color.GRAY); // Konstanta dalam class Color
    }
    public void paint(Graphics g) {
        Font f = new Font("Helvetica", Font.BOLD, 48);
        FontMetrics fm = getFontMetrics(f);
        g.setFont(f);
        
        String S = "TEKS INI TAMPIL DI TENGAH";
        int xpos = (this.size().width - fm.stringWidth(S)) / 2;
        int ypos = (this.size().height) / 2;
        g.drawString(S, xpos, ypos);
    }
    public static void main(String[] args) {
        Frame f = new Frame("Testing Graphics Panel");
        TextTengah gp = new TextTengah();
        f.add(gp);
        f.setSize(600, 300);
        f.setVisible(true);
    }
}
