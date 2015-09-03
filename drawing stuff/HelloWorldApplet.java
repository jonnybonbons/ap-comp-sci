import java.applet.Applet;
import java.awt.Label;

public class HelloWorldApplet extends Applet {
    @Override
    public void init() {
        setSize(500, 120);
        add(new Label("Controls:"));
        add(new Label("R for Black"));
        add(new Label("F for Eraser"));
        add(new Label("Q for Red"));
        add(new Label("W for Blue"));
        add(new Label("E for Green"));
        add(new Label("A for Cyan"));
        add(new Label("S for Magenta"));
        add(new Label("D for Yellow"));
        add(new Label("Z to Increase Brush Size"));
        add(new Label("X to Decrease Brush Size"));
        add(new Label("V to Reset Brush Size"));
        add(new Label("C to Clear Screen"));
        add(new Label("1 for Round Brush"));
        add(new Label("2 for Square Brush"));
    }
}