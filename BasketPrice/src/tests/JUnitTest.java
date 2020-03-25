package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import basketPrice.Constants;
import basketPrice.Item;
import basketPrice.PriceCalculator;

class JUnitTest {
	PriceCalculator newCalc = null;
	double epsilon = 0.000001;
	@BeforeEach
	void setUp() throws Exception {
		newCalc = new PriceCalculator();
	}
	// never compare doubles with == 
	boolean equalsEpsilon(double d1, double d2, double epsilon) {
		return Math.abs(d1-d2) < epsilon;
	}
	
	@Test
	void TestBlankIsZero() {
		double blankPrice = newCalc.calculatePrice(Arrays.asList());
		assert(equalsEpsilon(blankPrice, 0, epsilon));
	}
	@Test
	void TestSingleItemBanana() {
		double blankPrice = newCalc.calculatePrice(Arrays.asList(Item.Banana));
		assert(equalsEpsilon(blankPrice, Constants.prices.get(Item.Banana) * Constants.HST, epsilon));
	}
	
	@Test
	void TestSingleItemOrange() {
		double blankPrice = newCalc.calculatePrice(Arrays.asList(Item.Orange));
		assert(equalsEpsilon(blankPrice, Constants.prices.get(Item.Orange) * Constants.HST, epsilon));
	}
	
	@Test
	void TestSingleItemApple() {
		double blankPrice = newCalc.calculatePrice(Arrays.asList(Item.Apple));
		assert(equalsEpsilon(blankPrice, Constants.prices.get(Item.Apple) * Constants.HST, epsilon));
	}
	
	@Test
	void TestSingleItemLemon() {
		double blankPrice = newCalc.calculatePrice(Arrays.asList(Item.Lemon));
		assert(equalsEpsilon(blankPrice, Constants.prices.get(Item.Lemon) * Constants.HST, epsilon));
	}
	
	@Test
	void TestSingleItemPeach() {
		double blankPrice = newCalc.calculatePrice(Arrays.asList(Item.Peach));
		assert(equalsEpsilon(blankPrice, Constants.prices.get(Item.Peach) * Constants.HST, epsilon));
	}
	@Test
	void TestThreeBananas() {
		double blankPrice = newCalc.calculatePrice(Arrays.asList(Item.Banana,Item.Banana, Item.Banana));
		assert(equalsEpsilon(blankPrice, Constants.prices.get(Item.Banana)*3 * Constants.HST, epsilon));
	}	
	@Test
	void TestOneOfEach() {
		double blankPrice = newCalc.calculatePrice(Arrays.asList(Item.Banana,Item.Orange, Item.Lemon, Item.Peach, Item.Apple));
		assert(equalsEpsilon(blankPrice, (
				Constants.prices.get(Item.Banana)+
				Constants.prices.get(Item.Orange)+
				Constants.prices.get(Item.Lemon)+
				Constants.prices.get(Item.Apple)+
				Constants.prices.get(Item.Peach) ) * Constants.HST, epsilon));
	}	
}
