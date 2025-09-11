package com.gustavofarias.exerciciosdp3.strategy.discount;

public class PercentageDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double total, int itemCount) {
        return total * 0.90;
    }
}
