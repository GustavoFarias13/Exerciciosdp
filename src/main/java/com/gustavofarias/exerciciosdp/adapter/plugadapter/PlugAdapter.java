package com.gustavofarias.exerciciosdp.adapter.plugadapter;

public class PlugAdapter implements BrazilianOutlet {

    private AmericanDryer dryer;

    public PlugAdapter(AmericanDryer dryer) {
        this.dryer = dryer;
    }

    @Override
    public void plugIntoSocket() {
        System.out.println("Adaptador converteu a tomada brasileira para padrão americano.");
        dryer.plugInFlatPlug();
    }
}
