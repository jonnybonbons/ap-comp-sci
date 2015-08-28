
import java.awt.*;
import javax.swing.*;

/**
 * Class drawing - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class drawing extends JApplet
{
    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
       g.setColor(Color.orange);
       g.fillRect(10,10,300,300);
       g.setColor(Color.red);
       g.drawLine(40,310,40,360);
       g.drawLine(280,310,280,360);
       g.setColor(Color.gray);
       g.fillOval(50,50,50,50);
       g.fillOval(200,50,50,50);
       g.setColor(Color.white);
       g.fillOval(52,52,46,46);
       g.fillOval(202,52,46,46);
    }
}
