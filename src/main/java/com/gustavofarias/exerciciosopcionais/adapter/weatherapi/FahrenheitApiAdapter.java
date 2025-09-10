package com.gustavofarias.exerciciosopcionais.adapter.weatherapi;

public class FahrenheitApiAdapter implements ClimaService{
    private FahrenheitApi fahrenheitApi;

    public FahrenheitApiAdapter(FahrenheitApi fahrenheitApi) {
        this.fahrenheitApi = fahrenheitApi;
    }

    @Override
    public double getTemperatureCelsius() {
        double f = fahrenheitApi.getTemperatureFahrenheit();
        return (f - 32) * 5 / 9;
    }
}
