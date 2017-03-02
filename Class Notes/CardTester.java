

/**
 * Write a description of class CardTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardTester
{
    public static void main(String[] args)
    {
        BillFold billfold = new BillFold();
        IDCard card1 = new IDCard("Shawn", 12345);
        //CallingCard card2 = new CallingCard("Richard", 56789, 1234);
        DriverLicense card2 = new DriverLicense("Artur", 2016);
        System.out.println(billfold.formatCards());
        billfold.addCard(card1);
        System.out.println(billfold.formatCards());
        billfold.addCard(card2);
        System.out.println(billfold.formatCards());
        System.out.println(card1.isExpired());
        System.out.println(card2.isExpired());
        System.out.println(billfold.getExpiredCardCount());
        System.out.println(card1.toString());
        System.out.println(card2.toString());
    }
}
