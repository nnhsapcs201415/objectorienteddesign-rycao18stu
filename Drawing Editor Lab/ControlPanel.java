import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
 * The panel that contains the controls and indicators for the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class ControlPanel extends JPanel
{
    private JButton button1, button2, button3;
    private JPanel colorPanel;
    private DrawingPanel canvas;

    /**
     * Constructor for objects of class ControlPanel
     */
    public ControlPanel( DrawingPanel canvas)
    {
        ActionListener actionListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JButton source = (JButton) e.getSource();
                if (source == button1) 
                {
                    canvas.pickColor();
                    colorPanel.setBackground(canvas.getColor());
                } else if (source == button2)
                {
                    canvas.addCircle();
                    canvas.requestFocusInWindow();
                } else if (source == button3)
                {
                    canvas.addSquare();
                    canvas.requestFocusInWindow();
                }
            }
        };
        
        this.canvas = canvas;
        canvas.setBackground(Color.WHITE);
        
        this.button1 = new JButton("Pick Color");
        this.colorPanel = new JPanel();
        this.colorPanel.setBackground(canvas.getColor());
        this.button2 = new JButton("Add Circle");
        this.button3 = new JButton("Add Square");

        this.button1.addActionListener(actionListener);
        this.button2.addActionListener(actionListener);
        this.button3.addActionListener(actionListener);
        
        add(this.button1);
        add(this.colorPanel);
        add(this.button2);
        add(this.button3);
        add(this.canvas);
    }
}
