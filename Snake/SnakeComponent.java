import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class SnakeLogic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeComponent extends JComponent
{
    PlayerTile[][] tiles = new PlayerTile[80][165];
    /**
     * Default constructor for the CityscapeComponent
     */
    public SnakeComponent()
    {
        for(int a = 0; a < this.tiles.length; a++)
        {
            for (int b = 0; b < this.tiles[0].length; b++)
            {
                this.tiles[a][b] = new PlayerTile(a * 10, b * 10);
            }
        }
    }

    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        for(int a = 0; a < this.tiles.length; a++)
        {
            for (int b = 0; b < this.tiles[0].length; b++)
            {
                this.tiles[a][b].draw(g2);
            }
        }
    }

    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     * @param   milliseconds      milliseconds that have passed since the animation has started
     */
    public void nextFrame(int milliseconds)
    {
        this.step = milliseconds % 2100;
        this.step = this.step/1050;
        if(this.down){
            if(this.g < 10)
            {
                this.down = false;
                this.sunny = false;
                this.building.setWindowColor(255, 215, 0);
                this.building2.setWindowColor(255, 215, 0);
            }
            this.g = (this.g - (4 * this.step));
            this.b = (this.b - (5 * this.step));
            this.background.setColor(0, this.g, this.b);
            repaint();
        } else {
            if (this.g > 110)
            {
                this.down = true;
                this.sunny = true;
                this.building.setWindowColor(2, 97, 128);
                this.building2.setWindowColor(2, 97, 128);
            }
            this.g = (this.g + (4 * this.step));
            this.b = (this.b + (5 * this.step));
            this.background.setColor(0, this.g, this.b);
            repaint();
        }
        if (this.car.getXpos() > 1560)
        {
            this.car.setPosition(this.car.getXpos(), this.car.getYpos() - 60);
            this.direction = "left";
        } else if (this.car.getXpos() < 20) 
        {
            this.car.setPosition(this.car.getXpos(), this.car.getYpos() + 60);
            this.direction = "right";
        } else {
        }
        if (this.direction == "left")
        {
            this.car.setPosition(this.car.getXpos() - 10, this.car.getYpos());
        } else {
            this.car.setPosition(this.car.getXpos() + 10, this.car.getYpos());
        }
        repaint();
    }
}
