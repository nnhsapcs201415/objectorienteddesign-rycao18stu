import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Point2D;

/**
 * Write a description of abstract class DrawingShape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class DrawingShape
{
    Point2D.Double center;
    double radius;
    Color color;
    public DrawingShape(Point2D.Double point, double radius, Color color)
    {
        this.center = point;
        this.radius = radius;
        this.color = color;
    }
    public Color getColor()
    {
        return this.color;
    }
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    public double getRadius()
    {
        return this.radius; 
    }
    public void move(double x, double y)
    {
        this.center.setLocation(this.center.getX() + x, this.center.getY() + y);
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public abstract boolean isInside(Point2D.Double point);
    public abstract boolean isOnBorder(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);
}
