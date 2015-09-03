import java.io.*;
import javax.swing.event.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;
import java.awt.*;

public class menu extends JFrame 
{
    public menu() {
        initUI();
//         Class HelloWorldApplet = Class.forName("HelloWorldApplet");
//         Applet appletToLoad = (Applet)HelloWorldApplet.newInstance();
//         appletToLoad.setStub(this);
//         setLayout(new GridLayout(1,0));
//         add(appletToLoad);
//         appletToLoad.init();
//         appletToLoad.start();
    }

    private void initUI() {
        createMenuBar();

        setTitle("Menu");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File"); 

        JMenuItem eMenuItem = new JMenuItem("Help");
        eMenuItem.setToolTipText("Displays Instruction"); {

            //open help file here
        }
    }
}