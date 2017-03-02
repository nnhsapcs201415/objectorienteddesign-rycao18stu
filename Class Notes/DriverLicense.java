import java.util.GregorianCalendar;

/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    private int expire;
    GregorianCalendar calendar = new GregorianCalendar();
    public DriverLicense(String name, int expire)
    {  
        super(name);
        this.expire = expire;
    }
    
    public String format()
    {
        String s = super.format();
        return s + " Expiration Year: " + expire;
    }
    
    public boolean isExpired()
    {
        if (calendar.get(calendar.YEAR) - this.expire > 0) return true;
        return false;
    }
    
    public String toString()
    {
        return "DriverLicense[name=" + this.getName() + "][Expiration Year=" + this.expire + "]";
    }
}
