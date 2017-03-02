import javax.swing.JFrame;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @rycao18stu
 * @version 10/6/16
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60*3000 milliseconds
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
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent();
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
