
/**
 * Write a description of class BillFold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BillFold
{
    private Card card1;
    private Card card2;
    public BillFold()
    {
    }

    public void addCard(Card card)
    {
        if (this.card1 == null)
        {
            this.card1 = card;
        } else if (this.card2 == null)
        {
            this.card2 = card;
        }
    }

    public String formatCards()
    {
        String s = "";
        if (this.card1 != null) s += this.card1.format();
        if (this.card2 != null) s += "  |  " + this.card2.format();
        return s;
    }
    
    public int getExpiredCardCount()
    {
        int ret = 0;
        if (this.card1.isExpired()) ret += 1;
        if (this.card2.isExpired()) ret += 1;
        return ret;
    }
}
