import javax.swing.JFrame;
import java.awt.event.*;

/**
 * Write a description of class BoxViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoxViewer
{
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame();
        frame.setSize(1680, 1050);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BoxComponent component = new BoxComponent();
        frame.add(component);
        
        frame.setVisible(true);
        
        while(true) {
            component.nextFrame();
            Thread.sleep(70);
        }
    }
}
