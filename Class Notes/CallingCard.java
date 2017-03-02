
/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    private int cardnum, pin;
    public CallingCard(String name, int cardnum, int pin)
    {
        super(name);
        this.cardnum = cardnum;
        this.pin = pin;
    }
    
    public String format()
    {
        String s = super.format();
        return s + " CardNum: " + cardnum + " PIN: " + pin;
    }
    
    public String toString()
    {
        return "CallingCard[name=" + this.getName() + "][cardnum=" + this.cardnum + "][pin=" + this.pin + "]";
    }
}
