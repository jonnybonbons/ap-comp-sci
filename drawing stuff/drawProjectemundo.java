import java.awt.*;
import java.applet.*;
import javax.swing.event.*;
import java.net.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Image;
import java.io.*;

public class drawProjectemundo extends JApplet implements KeyListener, MouseListener, MouseMotionListener
{
    int m, n; //mouse position
    int r = 5; //radius of drawing
    boolean cs = true; //clear screen
    int shape = 1; //1 for circle, 2 for rectangle
    int tellShape; //tellShape method for printing brush shape
    boolean splash = true; //defining splash screen
    boolean protectTheText;
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
        //splash start
        if(splash == true) {
            g.drawString("Drawing Thing by Jonathan (Jon Jon) Pham", getWidth() / 3, getHeight() / 2);
            splash = false;
            cs = true;
        }
        else if (cs == true) {
            g.setColor(Color.white);
            g.fillRect(0, 0, w, h);
            cs = false;
        }
        g.setColor(c);
        if (shape == 1 && protectTheText == false) {
            g.fillOval(m - r, n - r, 2 * r, 2 * r);
        }
        if (shape == 2 && protectTheText == false) {
            g.fillRect(m - r, n - r, 2 * r, 2 * r);
        }
        //white box to protect the text and stuff because getting legal bounds to work is a pain and i'm sleepy
        g.setColor(Color.white);
        g.fillRect(0, h - 90, 503, 75);
        //start color box for UI
        g.setColor(Color.lightGray);
        g.fillRect(0, getHeight() - 70, 430, 40);
        g.setColor(Color.red);
        g.fillRect(10, getHeight() - 60, 25, 20);
        g.setColor(Color.blue);
        g.fillRect(45, getHeight() - 60, 25, 20);
        g.setColor(Color.green);
        g.fillRect(80, getHeight() - 60, 25, 20);
        g.setColor(Color.cyan);
        g.fillRect(115, getHeight() - 60, 25, 20);
        g.setColor(Color.magenta);
        g.fillRect(150, getHeight() - 60, 25, 20);
        g.setColor(Color.yellow);
        g.fillRect(185, getHeight() - 60, 25, 20);
        g.setColor(Color.black);
        g.fillRect(220, getHeight() - 60, 25, 20);
        g.setColor(Color.white);
        g.fillRect(255, getHeight() - 60, 25, 20);
        g.fillRect(290, getHeight() - 60, 25, 20);
        g.fillRect(325, getHeight() - 60, 25, 20);
        g.fillRect(360, getHeight() - 60, 25, 20);
        g.fillRect(395, getHeight() - 60, 25, 20);
        g.setColor(Color.pink);
        g.fillRect(255, getHeight() - 60, 25, 10);
        //start UI outlining - may remove
        g.setColor(Color.black);
        g.drawRect(0, getHeight() - 70, 430, 40);
        g.drawLine(216, getHeight() - 70, 216, getHeight() - 30);
        g.drawLine(320, getHeight() - 70, 320, getHeight() - 30);
        g.drawLine(430, getHeight() - 70, 430, getHeight() - 30);
        //borders around colors, not sure if going to keep/add back
        g.drawRect(10, getHeight() - 60, 25, 20);
        g.drawRect(45, getHeight() - 60, 25, 20);
        g.drawRect(80, getHeight() - 60, 25, 20);
        g.drawRect(115, getHeight() - 60, 25, 20);
        g.drawRect(150, getHeight() - 60, 25, 20);
        g.drawRect(185, getHeight() - 60, 25, 20);
        g.setColor(Color.white);
        g.drawRect(220, getHeight() - 60, 25, 20);
        g.setColor(Color.black);
        g.drawRect(255, getHeight() - 60, 25, 20);
        g.drawRect(290, getHeight() - 60, 25, 20);
        g.drawRect(325, getHeight() - 60, 25, 20);
        g.drawRect(360, getHeight() - 60, 25, 20);
        g.drawRect(395, getHeight() - 60, 25, 20);
        //start instructions in color boxes
        g.drawString("1", 19, getHeight() - 46);
        g.setColor(Color.white);
        g.drawString("2", 53, getHeight() - 46);
        g.setColor(Color.black);
        g.drawString("3", 89, getHeight() - 46);
        g.drawString("4", 124, getHeight() - 46);
        g.drawString("5", 159, getHeight() - 46);
        g.drawString("6", 194, getHeight() - 46);
        g.setColor(Color.white);
        g.drawString("Q", 229, getHeight() - 46);
        g.setColor(Color.black);
        g.drawString("W", 263, getHeight() - 46);
        g.drawString("C", 298, getHeight() - 46);
        g.drawString("Z", 335, getHeight() - 49);
        g.drawString("+", 335, getHeight() - 40);
        g.drawString("X", 370, getHeight() - 49);
        g.drawString(" -", 370, getHeight() - 40);
        g.drawString("V", 405, getHeight() - 49);
        g.drawString("=", 405, getHeight() - 40);
        g.drawString("Select box to change color, erase, or increase brush size; or press the labeled key", 3, getHeight() - 75);
        g.drawString("Use these to change brush size!", 321, getHeight() - 17);
        g.drawString("Press 'a' for a round brush or 's' for a square brush", 3, getHeight() - 17);
    }

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == '1') {
            c = Color.red;
        }
        if (e.getKeyChar() == '2') {
            c = Color.blue;
        }
        if (e.getKeyChar() == '3') {
            c = Color.green;
        }
        if (e.getKeyChar() == '4') {
            c = Color.cyan;
        }
        if (e.getKeyChar() == '5') {
            c = Color.magenta;
        }
        if (e.getKeyChar() == '6') {
            c = Color.yellow;
        }
        if (e.getKeyChar() == 'q') {
            c = Color.black;
        }
        if (e.getKeyChar() == 'w') {
            c = Color.white;
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
        if (e.getKeyChar() == 'a') {
            shape = 1;
            tellShape = 1;
        }
        if (e.getKeyChar() == 's') {
            shape = 2;
            tellShape = 2;
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
        if (e.getX() >= 10 &&
        e.getX() <= 35  &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
            c = Color.red;
        if (e.getX() >= 45 &&
        e.getX() <= 70 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
            c = Color.blue;
        if (e.getX() >= 80 &&
        e.getX() <= 105 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
            c = Color.green;
        if (e.getX() >= 115 && //fix from here on - cyan on are moved to the right 1 box length
        e.getX() <= 140 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
            c = Color.cyan;
        if (e.getX() >= 150 &&
        e.getX() <= 175 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
            c = Color.magenta;
        if (e.getX() >= 185 &&
        e.getX() <= 210 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
            c = Color.yellow;
        if (e.getX() >= 220 &&
        e.getX() <= 245 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
            c = Color.black;
        if (e.getX() >= 255 &&
        e.getX() <= 280 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
            c = Color.white;
        if (e.getX() >= 290 &&
        e.getX() <= 315 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            cs = true;
            m = -getWidth();
            n = -getHeight();
            repaint();
        }
        if (e.getX() >= 325 &&
        e.getX() <= 350 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
            r = r+5;
        if (e.getX() >= 360 &&
        e.getX() <= 385 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
            r = r-5;
        if (e.getX() >= 395 &&
        e.getX() <= 420 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
            r = 5;
    }

    public void mousePressed(MouseEvent e) {}

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
