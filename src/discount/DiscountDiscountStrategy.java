package discount;

public class DiscountDiscountStrategy implements DiscountStrategy{
    @Override
    public double discount(double initialPrice) {
        return initialPrice - (initialPrice * .5);
    }
}
