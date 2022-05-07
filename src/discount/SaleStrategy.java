package discount;

public class SaleStrategy implements DiscountStrategy{
    @Override
    public double discount(double initialPrice) {
        return initialPrice - (initialPrice * .1);
    }
}
