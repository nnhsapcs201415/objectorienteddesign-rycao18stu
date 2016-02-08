import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class ButtonView
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;
    
    public static void main( String[] args )
    {
        JFrame frame = new JFrame();
        JButton button = new JButton( "Click me!" );
        frame.add( button );
        
        ClickListener listener = new ClickListener();
        button.addActionListener( listener );
        
        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
}
