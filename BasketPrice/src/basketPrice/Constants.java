package basketPrice;

import java.util.Map;

public class Constants {
	 public static Map<Item, Double> prices = Map.of(
		        Item.Banana, 1.5d,
		        Item.Orange, 3.2d,
		        Item.Apple, 1.3d,
		        Item.Lemon, 4.1d,
		        Item.Peach, 3.0d 
		    );
	 public static double HST = 1.13d;// HST is 13% 
}
