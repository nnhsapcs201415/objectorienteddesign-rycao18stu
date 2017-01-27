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
    PlayerTile[][] tiles = new PlayerTile[81][48];
    /**
     * Default constructor for the CityscapeComponent
     */
    public SnakeComponent()
    {
        for(int a = 0; a < this.tiles.length; a++)
        {
            for (int b = 0; b < this.tiles[0].length; b++)
            {
                this.tiles[a][b] = new PlayerTile(a * 20, b * 20);
                if (a == 0 || b == 0 || a == 80 || b == 47) 
                    this.tiles[a][b].setWall(true);
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
        repaint();
    }
}
