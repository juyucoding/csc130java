import java.text.NumberFormat;
//import .Item;

public class ShoppingCart 
{
   private int itemCount;
   private double totalPrice;
   private int capacity;
   Item[] cart;

   public ShoppingCart()
   {
   	capacity = 5;
	itemCount = 0;
	totalPrice = 0.0;
	cart = new Item[capacity];
   }
   
   public void addToCart(String itemName, double price, int quantity)
   {
   	if (itemCount > 5)
	{
		System.out.println("Now the shopping cart is full.");
	}
	else
	{
		cart[itemCount] = new Item(itemName, price, quantity);
		totalPrice = totalPrice + (price * quantity);
	}
	itemCount = itemCount+1;
   }
   public String toString()
   {
   	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	String contents = "\nShopping Cart\n";
	contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
	for (int i=0; i<itemCount; i++)
	{
		contents += cart[i].toString() + "\n";
		contents += "\nTotal Price: " + fmt.format(totalPrice);
		contents += "\n";

	}
	return contents;
   }
   public void increaseSize()
   {
   	capacity = capacity+3;
   }
   public double getTotalPrice()
   {
   	return totalPrice;
   }
}
