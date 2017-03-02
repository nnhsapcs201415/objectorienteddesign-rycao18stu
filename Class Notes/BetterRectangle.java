import java.awt.Rectangle;

/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BetterRectangle extends Rectangle
{
    public BetterRectangle(int x, int y, int width, int height)
    {
        // super(x, y, width, height);
        setLocation(x, y);
        setSize(width, height);
    }
    public double getPerimeter()
    {
        return ((2 * this.getWidth()) + (2 * this.getHeight()));
    }
    public double getArea()
    {
        return (this.getWidth() * this.getHeight());
    }
}
