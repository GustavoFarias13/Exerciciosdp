package com.gustavofarias.exerciciosdp3.strategy.discount;

public class ProgressiveDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double total, int itemCount) {
        double discount = itemCount * 5; // R$5 de desconto por item
        double discounted = total - discount;
        return discounted < 0 ? 0 : discounted;
    }
}
