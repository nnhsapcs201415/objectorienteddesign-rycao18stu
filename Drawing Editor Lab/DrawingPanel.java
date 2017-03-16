import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

/**
 * The panel in which draws all of the shapes in the drawing editor
 * 
 * @author rycao18stu
 * @version 1 march 2017
 */
public class DrawingPanel extends JPanel
{
    Color fillColor;
    ArrayList<DrawingShape> list;
    DrawingShape activeShape;
    private boolean moving;

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        MouseAdapter mouseAdapter = new MouseAdapter()
        {
            Point2D.Double origin;
            Point2D.Double lastPoint;
            public void mousePressed(MouseEvent e)
            {
                for (int i = 0; i < list.size(); i++)
                {
                    DrawingShape shape = list.get(i);
                    if(shape.isInside(new Point2D.Double(e.getX(), e.getY())))
                    {
                        origin = new Point2D.Double(e.getX(), e.getY());
                        activeShape = shape;
                        moving = true;
                    } else if (shape.isOnBorder(new Point2D.Double(e.getX(), e.getY())))
                    {
                        activeShape = shape;
                        moving = false;
                    }
                    origin = new Point2D.Double(e.getX(), e.getY());
                }
            }
            public void mouseDragged(MouseEvent e) throws NullPointerException
            {
                for (int i = 0; i < list.size(); i++)
                {
                    DrawingShape shape = list.get(i);
                    if (moving)
                    {
                        if(shape.isInside(new Point2D.Double(e.getX(), e.getY())) && (shape == activeShape))
                        {
                            try {
                                shape.move(origin.getX() - e.getX(), origin.getY() - e.getY());
                            } catch (NullPointerException nullevent) {}
                            origin = new Point2D.Double(e.getX(), e.getY());
                            repaint();
                        }
                    } else
                    {
                        if (shape == activeShape)
                        {
                            try {
                                if (e.getY() > shape.getCenter().getY())
                                {
                                    if (lastPoint.getX() - e.getX() > 0)
                                    {
                                        if (lastPoint.getY() - e.getY() < 0) shape.setRadius(shape.getRadius() + Math.sqrt(Math.pow(lastPoint.getX() - e.getX(), 2) + Math.pow(lastPoint.getY() - e.getY(), 2)));
                                        else shape.setRadius(shape.getRadius() - Math.sqrt(Math.pow(lastPoint.getX() - e.getX(), 2) + Math.pow(lastPoint.getY() - e.getY(), 2)));
                                    } else 
                                    {
                                        if (lastPoint.getY() - e.getY() < 0) shape.setRadius(shape.getRadius() + Math.sqrt(Math.pow(lastPoint.getX() - e.getX(), 2) + Math.pow(lastPoint.getY() - e.getY(), 2)));
                                        else shape.setRadius(shape.getRadius() - Math.sqrt(Math.pow(lastPoint.getX() - e.getX(), 2) + Math.pow(lastPoint.getY() - e.getY(), 2)));
                                    }
                                } else 
                                {
                                    if (lastPoint.getX() - e.getX() > 0)
                                    {
                                        if (lastPoint.getY() - e.getY() < 0) shape.setRadius(shape.getRadius() - Math.sqrt(Math.pow(lastPoint.getX() - e.getX(), 2) + Math.pow(lastPoint.getY() - e.getY(), 2)));
                                        else shape.setRadius(shape.getRadius() + Math.sqrt(Math.pow(lastPoint.getX() - e.getX(), 2) + Math.pow(lastPoint.getY() - e.getY(), 2)));
                                    } else 
                                    {
                                        if (lastPoint.getY() - e.getY() < 0) shape.setRadius(shape.getRadius() - Math.sqrt(Math.pow(lastPoint.getX() - e.getX(), 2) + Math.pow(lastPoint.getY() - e.getY(), 2)));
                                        else shape.setRadius(shape.getRadius() + Math.sqrt(Math.pow(lastPoint.getX() - e.getX(), 2) + Math.pow(lastPoint.getY() - e.getY(), 2)));
                                    }
                                }
                            } catch (Exception eeee) {}
                            lastPoint = new Point2D.Double(e.getX(), e.getY());
                        }
                        repaint();
                    }
                }
            }
            public void mouseReleased(MouseEvent e)
            {
                moving = false; 
                origin = null;
                lastPoint = null;
            }
        };
        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
        this.list = new ArrayList<DrawingShape>();
        if (this.list.size() == 0) this.activeShape = null;
        this.moving = false;
    }

    /**
     * Invoked when the "Pick Color" button is clicked. Displays a JColorChooser and sets the
     *  selected color as the new fill color. Leaves the fill color unchanged if the user clicks
     *  "Cancel"
     *
     */
    public void pickColor()
    {
        Color selectedColor = JColorChooser.showDialog( this, "select the fill color", this.fillColor );

        if( selectedColor != null )
        {
            this.fillColor = selectedColor;
        }
    }

    /**
     * Returns the color of the panel
     * 
     * @return Color the color of the panel
     */
    public Color getColor()
    {
        return this.fillColor;
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(1600, 900);
    }

    /**
     * Adds a circle to the panel
     */
    public void addCircle()
    {
        Circle circle = new Circle(getPreferredSize().getWidth() / 2.0, getPreferredSize().getHeight() / 2.0, 
                Math.floor(new Random().nextInt(300)+100.0), this.fillColor);
        list.add(circle);
        this.activeShape = circle;
        repaint();
    }

    /**
     * Adds a square to the panel
     */
    public void addSquare()
    {
        Square square = new Square(getPreferredSize().getWidth() / 2, getPreferredSize().getHeight() / 2, 
                Math.floor(new Random().nextInt(300)+100), this.fillColor);
        list.add(square);
        this.activeShape = square;
        repaint();
    }
    /**
     * paints the jpanel
     * 
     * @param g Graphics object to paint on
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        for(int a = 0; a < list.size(); a++)
        {
            if (this.activeShape == list.get(a))
            {
                if (list.indexOf(this.activeShape) != list.size() - 1) 
                {
                    list.add(list.remove(list.indexOf(this.activeShape)));
                }
                list.get(a).draw(g2, false);
            } else list.get(a).draw(g2, true);
        }
    }
}
