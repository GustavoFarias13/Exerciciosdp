package com.gustavofarias.exerciciosdp3.strategy.discount;

public class MainShopping {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(200);
        cart.addItem(150);
        cart.addItem(100);

        System.out.println("Total sem desconto: " + cart.calculateTotal());

        cart.setDiscountStrategy(new FixedDiscount());
        System.out.println("Com desconto fixo: " + cart.calculateTotal());

        cart.setDiscountStrategy(new PercentageDiscount());
        System.out.println("Com desconto percentual: " + cart.calculateTotal());

        cart.setDiscountStrategy(new ProgressiveDiscount());
        System.out.println("Com desconto progressivo: " + cart.calculateTotal());
    }
}
