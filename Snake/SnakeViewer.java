import javax.swing.JFrame;

/**
 * Write a description of class SnakeViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeViewer
{
    // the cityscape will be animated for 180*1000 milliseconds
    static final int ANIMATION_TIME_IN_MS = 1800000;

    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();

        frame.setSize(1680 /* x */, 1050 /* y */);
        frame.setTitle("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // a frame contains a single component; create the Cityscape component and add it to the frame
        SnakeComponent component = new SnakeComponent();
        frame.add(component);

        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);

        // animate the cityscape
        for( int milliseconds = 0; milliseconds < ANIMATION_TIME_IN_MS; milliseconds += 70 )
        {
            component.nextFrame(milliseconds);
            Thread.sleep( 70 );
        }
    }
}
