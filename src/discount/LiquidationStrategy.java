package discount;

public class LiquidationStrategy implements DiscountStrategy {
    @Override
    public double discount(double initialPrice) {
        return initialPrice - (initialPrice * .75);
    }
}
