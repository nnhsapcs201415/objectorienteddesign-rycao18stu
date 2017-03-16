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
    /**
     * Default constructor for DrawingShape
     * 
     * @param point Point2D.Double object representing the center of the shape
     * @param radius double representing the radius of the shape
     * @param color java.awt.Color color of the shape
     */
    public DrawingShape(Point2D.Double point, double radius, Color color)
    {
        this.center = point;
        this.radius = radius;
        this.color = color;
    }
    /**
     * Returns the color of the shape
     * 
     * @return Color the color of the shape
     */
    public Color getColor()
    {
        return this.color;
    }
    /**
     * Returns the center of the shape
     * 
     * @return Point2D.Double Center of the shape
     */
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    /**
     * Returns the radius of the shape
     * 
     * @return double the radius of the shape
     */
    public double getRadius()
    {
        return this.radius; 
    }
    /**
     * Moves the shape to a new coordinate
     * 
     * @param x the x coordinate of the new coordinate we're moving the shape
     * @param y the y coordinate of the new coordinate we're moving the shape
     */
    public void move(double x, double y)
    {
        this.center.setLocation(this.center.getX() - x, this.center.getY() - y);
    }
    /**
     * Sets the radius of the shape
     * 
     * @param radius the radius of the shape
     */
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public abstract boolean isInside(Point2D.Double point);
    public abstract boolean isOnBorder(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);
    public abstract String toString();
}
