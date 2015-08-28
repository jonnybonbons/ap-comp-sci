import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
public class ps3 extends JApplet implements KeyListener
{
    int m, n; // (m, n) are coordinates
    public void init()
    {
        setFocusable(true);
        resize(800, 600);
        addKeyListener(this);
        m = 400;
        n = 300;
}
    public void paint (Graphics g)
    {
        int tempm = m;
        int tempn = n;
        g.setColor(Color.orange);
        g.fillOval(tempm, tempn, 20, 20);
        g.setColor(Color.black);
        g.fillOval(m - 10, n - 10, 20, 20); // draws a circle
    }
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyChar() == 'a')
        {
            m = m - 20; // moves “left” 20 pixels
        }
        // intentionally left blank: you’ll be adding code here
        if(e.getKeyChar() == 's')
        {
            n = n + 20;
        }
        if(e.getKeyChar() == 'd')
        {
            m = m + 20;
        }
        if(e.getKeyChar() == 'w')
        {
            n = n - 20;
        }
        if (m <= 0)
        {
            m = getWidth() - 1;
        }
        if (m >= getWidth())
        {
            m = 1;
        }
        if (n <= 0)
        {
            n = getHeight() - 1;
        }
        if (n >= getHeight())
        {
            n = 1;
        }
        repaint();
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}