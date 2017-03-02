import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class RectangleComponent2 extends JComponent
{
    private Point point1, point2, point3;
    private Graphics graphics;
    private int lines;

    public RectangleComponent2()
    {
        this.lines = 0;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if (this.lines >= 1) 
        {
            g2.drawLine((int)this.point1.getX(), (int)this.point1.getY(), (int)this.point2.getX(), (int)this.point2.getY());
        }
        if (this.lines <= 3 && this.lines > 0)
        {
            g2.drawLine((int)this.point1.getX(), (int)this.point1.getY(), (int)this.point3.getX(), (int)this.point3.getY());
            g2.drawLine((int)this.point2.getX(), (int)this.point2.getY(), (int)this.point3.getX(), (int)this.point3.getY());
        }
    }
    
    public void movePoints(int xTransform, int yTransform)
    {
        this.point1.setLocation(this.point1.getX() + xTransform, this.point1.getY() + yTransform);
        repaint();
    }
    
    public void setNextPoint(Point point)
    {
        if (this.lines == 0)
        {
            this.point1 = point;
            this.lines += 1;
        } else if (this.lines == 1)
        {
            this.point2 = point;
            this.lines += 1;
        } else 
        {
            this.point3 = point;
            this.lines += 1;
        }
    }
}