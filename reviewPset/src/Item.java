import java.text.NumberFormat;

public class Item
{
   private String name;
   private double price;
   private int quantity;

   public Item(String itemName, double itemPrice, int numPurchased)
   {
   	name = itemName;
	price = itemPrice;
	quantity = numPurchased;
   }
   public String toString()
   {
   	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t" + fmt.format(price*quantity));
   }
   public String getName()
   {
   	return name;
   }
   public int getQuantity()
   {
   	return quantity;
   }
}
