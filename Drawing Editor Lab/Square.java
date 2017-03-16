import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends DrawingShape
{
    /**
     * Default constructor for Square class
     * 
     * @param x the x coordinate of the center of the Square
     * @param y the y coordinate of the center of the Square
     * @param radius the radius of the Square
     * @param color the color of the Square
     */
    public Square(double x, double y, double radius, Color color)
    {
        super(new Point2D.Double(x, y), radius, color);
    }
    /**
     * Detects whether or not a point is inside the Square
     * 
     * @param point Point2D.Double object that we test if it's inside the Square
     * @return boolean Whether or not the point is inside the Square
     */
    public boolean isInside(Point2D.Double point)
    {
        if (Math.abs(this.getCenter().getX() - point.getX())*2 < radius && Math.abs(this.getCenter().getY() - point.getY())*2 < radius) return true;
        return false;
    }
    /**
     * Detects whether or not a point is on the edge or near the edge of the Square
     * 
     * @param point Point2D.Double object that we test if it's on the border of the Square
     * @return boolean Whether or not the point is on the border or near the border of the Square
     */
    public boolean isOnBorder(Point2D.Double point)
    {
        if ((Math.abs(this.getCenter().getX() - point.getX()) > (radius/2) - 5 && Math.abs(this.getCenter().getX() - point.getX()) < (radius/2) + 5)|| (Math.abs(this.getCenter().getY() - point.getY()) > (radius/2) - 5 && Math.abs(this.getCenter().getY() - point.getY()) < (radius/2) + 5)) return true;
        return false;
    }
    /**
     * Draws the Square
     * 
     * @param g2 Graphics2D object to draw on
     * @param boolean True if the Square is filled
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(this.getColor());
        g2.draw(new Rectangle2D.Double(this.getCenter().getX() - radius/2, this.getCenter().getY() - radius/2, this.getRadius(), this.getRadius()));
        if(filled) g2.fill(new Rectangle2D.Double(this.getCenter().getX() - radius/2, this.getCenter().getY() - radius/2, this.getRadius(), this.getRadius()));
    }
    /**
     * Default toString method for testing :)
     * 
     * @return String string containing the details of the Square
     */
    public String toString()
    {
        return "Type: Square, X-Coordinate: " + this.getCenter().getX() + ", Y-Coordinate: " + this.getCenter().getY() + " , Radius: " + this.getRadius() + ", Color: " + this.color.toString(); 
    }
}
