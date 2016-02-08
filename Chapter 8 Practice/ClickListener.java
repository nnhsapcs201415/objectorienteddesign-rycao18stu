import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickListener implements ActionListener
{
    private int count;
    
    public ClickListener()
    {
        count = 0;
    }
    
    public void actionPerformed( ActionEvent event )
    {
        count++;
        
        if( count == 1 )
        {
            System.out.println( "I was clicked 1 time!" );
        }
        else
        {
            System.out.println( "I was clicked " + count + " times!" );
        }
    }
}
