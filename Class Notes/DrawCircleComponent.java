import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class DrawCircleComponent extends JComponent
{
    Ellipse2D.Double circle;
    public DrawCircleComponent()
    {
        this.circle = new Ellipse2D.Double(10.0,10.0,5.0,5.0);
    }
    public void setPoints(Point point1, Point point2)
    {
        double radius = (Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2)));
        this.circle = new Ellipse2D.Double(
            point1.getX() - radius, 
            point1.getY() - radius,
            2 * radius, 
            2 * radius
        );
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(this.circle);
        repaint();
    }
}
