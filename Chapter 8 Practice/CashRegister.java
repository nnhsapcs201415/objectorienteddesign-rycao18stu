/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0.0;
      payment = 0.0;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      purchase += amount;
   }

   /**
      Enters the payment received from the customer; should be called once
      for each coin type.
      @param coinCount the number of coins
      @param coinType the type of the coins in the payment
   */
   public void enterPayment(int coinCount, Coin coinType)
   {
      payment += coinType.getValue() * coinCount;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;
      purchase = 0.0;
      payment = 0.0;
      change = Math.round(change * 100);
      change = change / 100;
      return change;
   }    
}
