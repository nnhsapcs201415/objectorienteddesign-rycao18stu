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
    public Square(double x, double y, double radius, Color color)
    {
        super(new Point2D.Double(x, y), radius, color);
    }
    public boolean isInside(Point2D.Double point)
    {
        if (Math.abs(this.getCenter().getX() - point.getX()) < radius && Math.abs(this.getCenter().getY() - point.getY()) < radius) return true;
        return false;
    }
    public boolean isOnBorder(Point2D.Double point)
    {
        if ((this.getCenter().getX() - point.getX()) == radius && (this.getCenter().getY() - point.getY() < radius)) return true;
        return false;
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(this.getColor());
        g2.draw(new Rectangle2D.Double(this.getCenter().getX() - radius/2, this.getCenter().getY() - radius/2, this.getRadius(), this.getRadius()));
        if(filled) g2.fill(new Rectangle2D.Double(this.getCenter().getX() - radius/2, this.getCenter().getY() - radius/2, this.getRadius(), this.getRadius()));
    }
}
