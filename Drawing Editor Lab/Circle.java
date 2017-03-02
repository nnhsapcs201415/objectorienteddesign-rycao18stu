import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends DrawingShape
{
    public Circle(double x, double y, double radius, Color color)
    {
        super(new Point2D.Double(x, y), radius, color);
    }
    public boolean isInside(Point2D.Double point)
    {
        if(Math.sqrt(Math.pow(point.getX() - this.getCenter().getX(), 2) + Math.pow(point.getY() - this.getCenter().getY(), 2)) < radius) return true;
        return false;
    }
    public boolean isOnBorder(Point2D.Double point)
    {
        if(Math.sqrt(Math.pow(point.getX() - this.getCenter().getX(), 2) + Math.pow(point.getY() - this.getCenter().getY(), 2)) == radius) return true;
        return false;
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(this.getColor());
        g2.draw(new Ellipse2D.Double(this.getCenter().getX() - radius/4, this.getCenter().getY() - radius/4, this.getRadius(), this.getRadius()));
        if(filled) g2.fill(new Ellipse2D.Double(this.getCenter().getX() - radius/4, this.getCenter().getY() - radius/4, this.getRadius(), this.getRadius()));
    }
}
