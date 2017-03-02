import java.util.ArrayList;
import java.util.Collections;

/**
A coin with a monetary value.
 */
public class Coin implements Comparable<Coin>
{
    private double value;
    private String name;

    /**
    Constructs a coin.
    @param aValue the monetary value of the coin
    @param aName the name of the coin
     */
    public Coin(double aValue, String aName) 
    { 
        value = aValue; 
        name = aName;
    }

    /**
    Gets the coin value.
    @return the value
     */
    public double getValue() 
    {
        return value;
    }

    /**
    Gets the coin name.
    @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Compares two Coin objects
     * 
     * @param otherObject the object to be compared
     * @return a negative integer, zero, or a positive integer, 
     * as this coin is less than, equal to, or greater than the
     * specified coin
     */
    public int compareTo(Coin other)
    {
        if (this.value < other.value)
        {
            return -1;
        } else if (this.value > other.value)
        {
            return 1;
        }
        return 0;
    }
    
    public String toString()
    {
        return "value: " + this.value + " name: " + this.name;
    }
    
    public static void main(String[] args)
    {
        Coin nickel = new Coin(0.05, "nickel");
        Coin dime = new Coin(0.1, "dime");
        Coin quarter = new Coin(0.25, "quarter");
        
        ArrayList<Coin> list = new ArrayList<Coin>();
        
        list.add(dime);
        list.add(quarter);
        list.add(nickel);
        
        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);
    }
}
