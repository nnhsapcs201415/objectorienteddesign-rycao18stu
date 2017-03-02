import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Point;


/**
This program displays a rectangle that can be moved with the mouse.
 */
public class DrawCircleViewer
{
    public static void main(String[] args)
    {
        DrawCircleComponent component = new DrawCircleComponent();
        JFrame frame = new JFrame("Draw me a nice circle");
        frame.setSize(500, 500);
        
        MouseAdapter mouseadapter = new MouseAdapter()
        {
            Point point1 = new Point(0,0);
            Point point2 = new Point(0,0);
            public void mouseClicked(MouseEvent e)
            {
                if (point1.getX() == 0.0) point1 = new Point(e.getX(), e.getY());
                else point2 = new Point(e.getX(), e.getY());
                if (point1.getX() != 0 && point2.getX() != 0)
                {
                    component.setPoints(point1, point2);
                }
            }
            public void mouseMoved(MouseEvent e)
            {

                System.out.println("HI");
                component.setPoints(point1, new Point(e.getX(), e.getY()));
            }
        };
        component.addMouseMotionListener(mouseadapter);
        frame.add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
