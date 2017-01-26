import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.*;

/**
 * Write a description of class PlayerTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTile
{
    private int x, y;
    private boolean player, food;
    public PlayerTile(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.player = false;
        this.food = false;
    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void togglePlayer()
    {
        if (this.player) this.player = false;
        else this.player = true;
    }
    public void toggleFood()
    {
        if (this.food) this.food = false;
        else this.food = true;
    }
    public boolean isFood()
    {
        if (this.food) return true;
        return false;
    }
    public void draw(Graphics2D g2)
    {
        Color bgColor;
        if (this.player)
        {
            bgColor = new Color(255, 222, 0);
        } else if (this.food)
        {
            bgColor = new Color(72, 223, 0);
        } else {
            bgColor = new Color(0, 22, 103);
        }
        Rectangle2D.Double background = new Rectangle2D.Double(
                x, y, 1680, 1050);
        g2.setColor(sky);
        g2.draw(background);
        g2.fill(background);
    }
}
