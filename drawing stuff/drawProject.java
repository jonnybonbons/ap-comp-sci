import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Image;

public class drawProject extends JApplet implements KeyListener, MouseListener, MouseMotionListener
{
    int m, n;
    int r = 10;
    boolean cs = true;
    Color c = Color.black;
    public void init()
    {
        setFocusable(true);
        resize(800, 600);
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        m = -100; 
        n = -100;
    }

    public void paint (Graphics g) 
    {
        int w = getWidth();
        int h = getHeight();
        if (cs == true) {
            g.setColor(Color.white);
            g.fillRect(0, 0, getWidth(), getHeight());
            cs = false;
        }
        g.setColor(c);
        g.fillOval (m - r, n - r, 2 * r, 2 * r);
        // g.setColor(Color.gray);
        // g.fillRect(5, 5, 50, 50);
        // wip for color boxes and cs
    }

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'q') {
            c = Color.red;
        }
        if (e.getKeyChar() == 'w') {
            c = Color.blue;
        }
        if (e.getKeyChar() == 'e') {
            c = Color.green;
        }
        if (e.getKeyChar() == 'r') {
            c = Color.black;
        }
        if (e.getKeyChar() == 'f') {
            c = Color.white;
        }
        if (e.getKeyChar() == 's') {
            c = Color.cyan;
        }
        if (e.getKeyChar() == 'd') {
            c = Color.magenta;
        }
        if (e.getKeyChar() == 'a') {
            c = Color.yellow;
        }
        if (e.getKeyChar() == 'p') {
            r = r+5;
        }
        if (e.getKeyChar() == 'o') {
            r = r-5;
        }
        if (e.getKeyChar() == 'c') {
            cs = true;
            m = -100;
            n = -100;
            repaint();
        }
    }

    public void mouseClicked(MouseEvent e) {}    
    // if (e.getX() > 5 &&
    // e.getX() < 55 &&
    // e.getY() > 5 &&
    // e.getY() < 55)
    // cs = true;
    // if (cs == true) {
    //    repaint();
    // work in progress for clickable colors and cs
    public void mousePressed(MouseEvent e) {

        m = e.getX();
        n = e.getY();
        repaint();
    }

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseDragged(MouseEvent e) {
        m = e.getX();
        n = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {}
}
