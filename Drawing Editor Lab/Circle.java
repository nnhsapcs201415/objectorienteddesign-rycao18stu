import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Circle here.
 * 
 * @author rycao18stu
 */
public class Circle extends DrawingShape
{
    /**
     * Default constructor for Circle class
     * 
     * @param x the x coordinate of the center of the Circle
     * @param y the y coordinate of the center of the Circle
     * @param radius the radius of the Circle
     * @param color the color of the Circle
     */
    public Circle(double x, double y, double radius, Color color)
    {
        super(new Point2D.Double(x, y), radius, color);
    }
    /**
     * Detects whether or not a point is inside the Circle
     * 
     * @param point Point2D.Double object that we test if it's inside the Circle
     * @return boolean Whether or not the point is inside the Circle
     */
    public boolean isInside(Point2D.Double point)
    {
        if(Math.sqrt(Math.pow(point.getX() - this.getCenter().getX(), 2) + Math.pow(point.getY() - this.getCenter().getY(), 2)) * 2 < radius) return true;
        return false;
    }
    /**
     * Detects whether or not a point is on the edge or near the edge of the Circle
     * 
     * @param point Point2D.Double object that we test if it's on the border of the Circle
     * @return boolean Whether or not the point is on the border or near the border of the Circle
     */
    public boolean isOnBorder(Point2D.Double point)
    {
        if(Math.sqrt(Math.pow(point.getX() - this.getCenter().getX(), 2) + Math.pow(point.getY() - this.getCenter().getY(), 2)) * 2 > radius - 5) return true;
        return false;
    }
    /**
     * Draws the Circle
     * 
     * @param g2 Graphics2D object to draw on
     * @param boolean True if the Circle is filled
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(this.getColor());
        g2.draw(new Ellipse2D.Double(this.getCenter().getX() - radius/4, this.getCenter().getY() - radius/4, this.getRadius(), this.getRadius()));
        if(filled) g2.fill(new Ellipse2D.Double(this.getCenter().getX() - radius/4, this.getCenter().getY() - radius/4, this.getRadius(), this.getRadius()));
    }
    /**
     * Default toString method for testing :)
     * 
     * @return String string containing the details of the Circle
     */
    public String toString()
    {
        return "Type: Circle, X-Coordinate: " + this.getCenter().getX() + ", Y-Coordinate: " + this.getCenter().getY() + " , Radius: " + this.getRadius() + ", Color: " + this.color.toString(); 
    }
}
