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
    boolean splash = true;
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
            g.drawString("4U. by Jon Jon", getWidth() / 2 - 30, getHeight() / 2 - 30);
            splash = false;
            cs = true;
        }
        else if (cs == true) {
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
        g.drawString("Z", 333, getHeight() - 46);
        g.drawString("X", 369, getHeight() - 46);
        g.drawString("V", 404, getHeight() - 46);
        g.drawString("Select box to change color, erase, or increase brush size; or press the labeled key", 0, getHeight() - 75);
        //if (tellShape == 1) {
        //    g.drawString("Round Brush", getWidth() / 2 - 10, getHeight() - 30);
        //}
        //if (tellShape == 2) {
        //    g.drawString("Square Brush", getWidth() / 2 - 10, getHeight() - 30);
        //}
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
        {
            c = Color.red;
        }
        if (e.getX() >= 45 &&
        e.getX() <= 80 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            c = Color.blue;
        }
        if (e.getX() >= 90 &&
        e.getX() <= 125 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            c = Color.green;
        }
        if (e.getX() >= 135 &&
        e.getX() <= 170 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            c = Color.cyan;
        }
        if (e.getX() >= 180 &&
        e.getX() <= 215 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            c = Color.magenta;
        }
        if (e.getX() >= 225 &&
        e.getX() <= 260 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            c = Color.yellow;
        }
        if (e.getX() >= 270 &&
        e.getX() <= 305 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            c = Color.black;
        } 
        if (e.getX() >= 315 &&
        e.getX() <= 350 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            c = Color.white;
        }
        if (e.getX() >= 360 &&
        e.getX() <= 395 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            cs = true;
            m = -getWidth();
            n = -getHeight();
            repaint();
        }
        if (e.getX() >= 405 &&
        e.getX() <= 440 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            r = r+5;
        }
        if (e.getX() >= 450 &&
        e.getX() <= 485 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            r = r-5;
        }
        if (e.getX() >= 495 &&
        e.getX() <= 530 &&
        e.getY() >= getHeight() - 60 &&
        e.getY() <= getHeight() - 40)
        {
            r = 5;
        }
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
