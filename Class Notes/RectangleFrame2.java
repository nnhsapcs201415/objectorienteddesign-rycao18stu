import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.*;

/**
This frame contains a moving rectangle.
 */
public class RectangleFrame2 extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private RectangleComponent2 scene;

    class MousePressListener implements MouseListener
    {
        private int clickTimes = 0;
        public void mouseMoved(MouseEvent event)
        {
        }

        public void mousePressed(MouseEvent event)
        {
        }

        public void mouseDragged(MouseEvent event) {}

        public void mouseReleased(MouseEvent event) {}

        public void mouseClicked(MouseEvent event)
        {
            if (this.clickTimes < 3)
            {
                int x = event.getX();
                int y = event.getY();
                this.clickTimes += 1;
                scene.setNextPoint(new Point(x, y));
            }
        }

        public void mouseEntered(MouseEvent event) {}

        public void mouseExited(MouseEvent event) {}
    }

    public RectangleFrame2()
    {
        scene = new RectangleComponent2();
        add(scene);

        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}