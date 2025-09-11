package com.gustavofarias.exerciciosdp3.strategy.discount;

public interface DiscountStrategy {
    double applyDiscount(double total, int itemCount);
}
