import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class ButtonViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 200;

    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JLabel label;

    public ButtonViewer()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.buttonA = new JButton("A");
        this.buttonB = new JButton("B");
        this.label = new JLabel("No button clicked.");

        this.panel.add(this.buttonA);
        this.panel.add(this.buttonB);
        this.panel.add(this.label);

        this.frame.add(this.panel);
        
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                label.setText("Button " + e.getActionCommand() + " was clicked");
            }
        };
        
        this.buttonA.addActionListener(listener);
        this.buttonB.addActionListener(listener);

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}
