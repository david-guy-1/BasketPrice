package basketPrice;

import java.util.List;

public class PriceCalculator {
    public double calculatePrice(List<Item> basket){
        double totalPrice = 0;
        for(Item i : basket){
            totalPrice += Constants.prices.get(i);
        }
        return totalPrice *Constants.HST; 
    }
}
