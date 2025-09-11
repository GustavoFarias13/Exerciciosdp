package com.gustavofarias.exerciciosdp3.strategy.discount;

public class FixedDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double total, int itemCount) {
        double discounted = total - 50;
        return discounted < 0 ? 0 : discounted;
    }
}
