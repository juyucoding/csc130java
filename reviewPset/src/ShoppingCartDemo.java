import java.util.Scanner;

public class ShoppingCartDemo
{
   public static void main(String[] args)
   {
   	Scanner keyboard = new Scanner(System.in);
   	boolean flag = true;
   	int userInput;
	String item_name;
	double item_price;
	int item_quant;
	int counter=0;

	ShoppingCart demoVer1 = new ShoppingCart();

	System.out.println("Press any number for shopping");
	System.out.println("Press 0 to exit.");
	userInput = keyboard.nextInt();
	if (userInput == 0)
	{	
		flag=false;
		System.exit(0);
	}
	
	while ((flag) && (counter < 5))
	{
		
		System.out.println("Enter item name");
		item_name = keyboard.next();
		System.out.println("Enter a price for the item");
		item_price = keyboard.nextDouble();
		System.out.println("Enter a quantity for the item");
		item_quant = keyboard.nextInt();
		demoVer1.addToCart(item_name, item_price, item_quant);
		counter++;
			
		System.out.println("Press any number for shopping.");
		System.out.println("Press 0  to exit.");
		userInput = keyboard.nextInt();
		if (userInput==0)
		{
			flag = false;	 
		}
		
	}
	System.out.println(demoVer1.toString());
	System.out.println("Pleas pay " + demoVer1.getTotalPrice());
	
   }
}
