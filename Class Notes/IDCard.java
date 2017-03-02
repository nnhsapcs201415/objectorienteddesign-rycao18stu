
/**
 * Write a description of class IDCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Card
{
    private int idNumber;
    public IDCard(String name, int id)
    {  
        super(name);
        idNumber = id;
    }
    
    public String format()
    {
        String s = super.format();
        return s + " IDNumber: " + idNumber;
    }
    
    public String toString()
    {
        return "IDCard[name=" + this.getName() + "][idNumber=" + this.idNumber +"]";
    }
    
    public boolean equals(Object otherObject)
    {
        if (otherObject instanceof IDCard)
        {
            IDCard other = (IDCard) otherObject;
            return this.getName().equals(other.getName()) 
                && (this.idNumber == other.idNumber);
        }
        
        return false;
    }
}
