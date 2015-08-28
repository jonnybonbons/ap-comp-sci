import java.awt.*;
import javax.swing.*;

public class dreams extends JApplet
{
    public void paint(Graphics g)
    {
        drawStar(g, 10, 10);
        drawStar(g, 210,10);
        drawStar(g, 410, 10);
        drawStar(g, 10, 210);
        drawStar(g, 210, 210);
        drawStar(g, 410, 210);
        drawStar(g, 10, 410);
        drawStar(g, 210, 410);
        drawStar(g, 410, 410);
        drawStar(g, 105, 105);
        drawStar(g, 305, 105);
        drawStar(g, 105, 305);
        drawStar(g, 305, 305);
    }
    public void drawStar(Graphics g, int x, int y)
    {
        int xpoints[] = {x + 20, x  + 40, x + 80, x + 120, x + 140, x + 140, x + 120, x + 80, x + 40, x + 20};
        int ypoints[] = {y + 80, y + 40, y + 20, y + 40, y + 80, y + 120, y + 160, y + 180, y + 160, y + 120};
        int npoints = 10;
        g.setColor(Color.black);
        g.fillPolygon(xpoints, ypoints, npoints);
        g.setColor(Color.blue);
        g.fillPolygon(xpoints, ypoints, npoints);
        g.setColor(Color.green);
        g.fillOval(x + 20, y + 80, 120, 40);
        g.setColor(Color.red);
        g.drawOval(x + 60, y + 20, 40, 160);
        g.fillOval(x + 60, y + 20, 40, 160);
        g.setColor(Color.green);
        g.drawOval(x + 20, y + 80, 120, 40);
    }
}