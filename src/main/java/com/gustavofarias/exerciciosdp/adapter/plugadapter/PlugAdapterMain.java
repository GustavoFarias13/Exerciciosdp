package com.gustavofarias.exerciciosdp.adapter.plugadapter;

public class PlugAdapterMain {
    public static void main(String[] args) {
        AmericanDryer dryer = new AmericanDryer();
        BrazilianOutlet outlet = new PlugAdapter(dryer);

        outlet.plugIntoSocket();
    }
}
