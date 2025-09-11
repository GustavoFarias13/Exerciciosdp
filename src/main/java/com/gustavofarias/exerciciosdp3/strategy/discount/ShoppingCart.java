package com.gustavofarias.exerciciosdp3.strategy.discount;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> items = new ArrayList<>();
    private DiscountStrategy discountStrategy;

    public void addItem(double price) {
        items.add(price);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal() {
        double total = items.stream().mapToDouble(Double::doubleValue).sum();
        if (discountStrategy != null) {
            return discountStrategy.applyDiscount(total, items.size());
        }
        return total;
    }
}
