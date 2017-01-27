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
    private boolean player, food, wall;
    public PlayerTile(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.player = false;
        this.food = false;
        this.wall = false;
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
    public boolean isWall()
    {
        return this.wall;
    }
    public void setWall(boolean state)
    {
        this.wall = true;
    }
    public void draw(Graphics2D g2)
    {
        Color bgColor = new Color(0, 0, 0);
        if (this.player)
        {
            bgColor = new Color(255, 222, 0);
        } else if (this.food)
        {
            bgColor = new Color(72, 223, 0);
        } else if (this.wall) 
        {
            bgColor = new Color(234, 0, 67);
        } else {
            bgColor = new Color(0, 22, 103);
        }
        Rectangle2D.Double tile = new Rectangle2D.Double(
                x + 2, y + 2, 16, 16);
        Rectangle2D.Double outline = new Rectangle2D.Double(
                x, y, 20, 20);
        g2.setColor(new Color (0, 0, 0));
        g2.draw(outline);
        g2.fill(outline);
        g2.setColor(bgColor);
        g2.draw(tile);
        g2.fill(tile);
    }
}
