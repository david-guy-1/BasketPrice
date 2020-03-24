package basketPrice;

import java.util.*;

enum item{
    Banana,  
    Orange,
    Apple,
    Lemon,
    Peach
};



public class BasketPrice{
	// I looked at several flyers and I can't find prices , so I just made up these numbers
    static Map<item, Double> prices = Map.of(
        item.Banana, 1.5d,
        item.Orange, 3.2d,
        item.Apple, 1.3d,
        item.Lemon, 4.1d,
        item.Peach, 3.0d 
    );
    
    public static double price(List<item> basket){
        double totalPrice = 0;
        for(item i : basket){
            totalPrice += prices.get(i);
        }
        return totalPrice * 1.13; // HST is 13% 
    }
    
}