import java.awt.*;
import java.applet.*;
import javax.swing.event.*;
import java.net.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Image;
import java.io.*;

public class drawProject extends JApplet implements KeyListener, MouseListener, MouseMotionListener
{
    int m, n;
    int r = 5;
    boolean cs = true;
    int shape = 1;
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
            g.fillRect(0, 0, w, h);
            cs = false;
        }
        g.setColor(c);
        if (shape == 1) {
            g.fillOval(m - r, n - r, 2 * r, 2 * r);
        }
        if (shape == 2) {
            g.fillRect(m - r, n - r, 2 * r, 2 * r);
        }
        //start color box for UI
        g.setColor(Color.gray);
        g.fillRect(0, getHeight() - 50, 490, 50);
        g.setColor(Color.red);
        g.fillRect(10, getHeight() - 40, 50, 40);
        g.setColor(Color.blue);
        g.fillRect(70, getHeight() - 40, 50, 40);
        g.setColor(Color.green);
        g.fillRect(130, getHeight() - 40, 50, 40);
        g.setColor(Color.cyan);
        g.fillRect(190, getHeight() - 40, 50, 40);
        g.setColor(Color.magenta);
        g.fillRect(250, getHeight() - 40, 50, 40);
        g.setColor(Color.yellow);
        g.fillRect(310, getHeight() - 40, 50, 40);
        g.setColor(Color.black);
        g.fillRect(370, getHeight() - 40, 50, 40);
        g.setColor(Color.white);
        g.fillRect(430, getHeight() - 40, 50, 40);
        //start UI outlining - may remove
        g.setColor(Color.black);
        g.drawRect(10, getHeight() - 40, 50, 40);
        g.setColor(Color.black);
        g.drawRect(70, getHeight() - 40, 50, 40);
        g.setColor(Color.black);
        g.drawRect(130, getHeight() - 40, 50, 40);
        g.setColor(Color.black);
        g.drawRect(190, getHeight() - 40, 50, 40);
        g.setColor(Color.black);
        g.drawRect(250, getHeight() - 40, 50, 40);
        g.setColor(Color.black);
        g.drawRect(310, getHeight() - 40, 50, 40);
        g.setColor(Color.white);
        g.drawRect(370, getHeight() - 40, 50, 40);
        g.setColor(Color.black);
        g.drawRect(430, getHeight() - 40, 50, 40);
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
        if (e.getKeyChar() == 'z') {
            r = r+5;
        }
        if (e.getKeyChar() == 'x') {
            r = r-5;
        }
        if (e.getKeyChar() == 'v') {
            r = 5;
        }
        if (e.getKeyChar() == '1') {
            shape = 1;
            // System.out.println("Round Brush");
        }
        if (e.getKeyChar() == '2') {
            shape = 2;
            // System.out.println("Square brush");
        }
        if (e.getKeyChar() == 'c') {
            cs = true;
            m = -getWidth();
            n = -getHeight();
            repaint();
        }
    }

    public void mouseClicked(MouseEvent e) {
        m = e.getX();
        n = e.getY();
        repaint();
        //start clicking regions for UI
        //         if (e.getX() >= 10 &&
        //         e.getX() <= 60  &&
        //         e.getY() >= getHeight() - 40 &&
        //         e.getY() <= getHeight() - 10);
        //         {
        //             c = Color.red;
        //         }
        //         if (e.getX() >= 70 &&
        //         e.getX() <= 120 &&
        //         e.getY() >= getHeight() - 40 &&
        //         e.getY() <= getHeight() - 10);
        //         {
        //             c = Color.blue;
        //         }
        //         if (e.getX() >= 130 &&
        //         e.getX() <= 180 &&
        //         e.getY() >= getHeight() - 40 &&
        //         e.getY() <= getHeight() - 10);
        //         {
        //             c = Color.green;
        //         }
        //         if (e.getX() >= 190 &&
        //         e.getX() <= 240 &&
        //         e.getY() >= getHeight() - 40 &&
        //         e.getY() <= getHeight() - 10);
        //         {
        //             c = Color.cyan;
        //         }
        //         if (e.getX() >= 250 &&
        //         e.getX() <= 300 &&
        //         e.getY() >= getHeight() - 40 &&
        //         e.getY() <= getHeight() - 10);
        //         {
        //             c = Color.magenta;
        //         }
        //         if (e.getX() >= 310 &&
        //         e.getX() <= 360 &&
        //         e.getY() >= getHeight() - 40 &&
        //         e.getY() <= getHeight() - 10);
        //         {
        //             c = Color.yellow;
        //         }
        //         if (e.getX() >= 370 &&
        //         e.getX() <= 420 &&
        //         e.getY() >= getHeight() - 40 &&
        //         e.getY() <= getHeight() - 10);
        //         {
        //             c = Color.black;
        //         } 
        //         if (e.getX() >= 430 &&
        //         e.getX() <= 480 &&
        //         e.getY() >= getHeight() - 40 &&
        //         e.getY() <= getHeight() - 10);
        //         {
        //             c = Color.white;
        //         }
    }

    public void mousePressed(MouseEvent e) {
        //         if (e.getX() >= 0 &&
        //         e.getX() <= getWidth() &&
        //         e.getY() >= 0 &&
        //         e.getY() < getHeight() - 50);
        //         {
        //             m = e.getX();
        //             n = e.getY();
        //             repaint();
        //         }
        //         if (e.getX() > 480 &&
        //         e.getX() <= getWidth() &&
        //         e.getY() >= 0 &&
        //         e.getY() <= getHeight());
        //         {
        //             m = e.getX();
        //             n = e.getY();
        //             repaint();
        //         }
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
