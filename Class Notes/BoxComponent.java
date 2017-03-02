import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class BoxComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoxComponent extends JComponent implements KeyListener
{
    Box box;
    String direction;
    public BoxComponent()
    {
        box = new Box(50, 50);
        this.direction = "stop";
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        this.box.draw(g2);
    }

    public void nextFrame()
    {
        if (this.direction.equals("up"))
        {
            box.setPos(box.getX(), box.getY() + 10);
        }
        if (this.direction.equals("down"))
        {
            box.setPos(box.getX(), box.getY() - 10);
        }
        if (this.direction.equals("left"))
        {
            box.setPos(box.getX() - 10, box.getY());
        }
        if (this.direction.equals("right"))
        {
            box.setPos(box.getX() + 10, box.getY());
        }
        if (this.direction.equals("stop")){ System.out.println("HI"); }
        repaint();
    }

    public void setDirection(String direction)
    {
        this.direction = direction;
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == 37) setDirection("left");
        if (e.getKeyCode() == 39) setDirection("right");
        if (e.getKeyCode() == 38) setDirection("up");
        if (e.getKeyCode() == 40) setDirection("down");
    }

    public void keyReleased(KeyEvent e)
    {
        setDirection("stop");
    }
}
