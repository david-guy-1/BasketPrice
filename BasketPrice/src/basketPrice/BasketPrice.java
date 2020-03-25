package basketPrice;

import java.util.*;
import basketPrice.Item;
import basketPrice.Constants;

public class BasketPrice{
	// I looked at several flyers and I can't find prices , so I just made up these numbers
   
    public static void main(String [] args) {
    	PriceCalculator newCalc = new PriceCalculator();
    	System.out.println(newCalc.calculatePrice(Arrays.asList(Item.Banana, Item.Orange, Item.Apple, Item.Apple))); 
    }
    
}