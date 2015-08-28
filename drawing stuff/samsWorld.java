import java.awt.*;
import javax.swing.*;
public class samsWorld extends JApplet {
    public void paint(Graphics g) {
        drawMan(g, 100, 100);
        drawMan(g, 150, 100);
        drawMan(g, 200, 100);
        drawMan(g, 250, 100);
        drawMan(g, 300, 100);
        drawMan(g, 350, 100);
        drawMan(g, 400, 100);
}
    public void drawMan(Graphics g, int x, int y) {
        g.drawLine(x, y, x, y + 100);
        g.drawLine(x, y + 100, x - 25, y + 125);
        g.drawLine(x, y + 100, x + 25, y + 125);
        g.drawLine(x, y + 35, x - 25, y + 10);
        g.drawLine(x, y + 35, x + 25, y + 10);
        g.drawOval(x - 25, y - 50, 50, 50);
}
}