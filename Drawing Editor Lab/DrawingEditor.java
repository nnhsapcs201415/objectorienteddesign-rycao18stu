import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;


/**
 * The window for the drawing editor.
 * 
 * @author rycao
 * @version 23 June 2015
 */
public class DrawingEditor extends JFrame
{
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        this.setTitle( "Drawing Editor" );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel( canvas );
        
        this.add(canvas, BorderLayout.CENTER);
        this.add(controls, BorderLayout.SOUTH);
        
        // add code here
        
        this.pack();
        this.setVisible( true );
    }
    
    
    public static void main( String[] args )
    {
       DrawingEditor drawingEditor = new DrawingEditor();
    }
}
