package com.gustavofarias.exerciciosopcionais.adapter.weatherapi;

public class KelvinApiAdapter implements ClimaService{
    private KelvinApi kelvinApi;

    public KelvinApiAdapter(KelvinApi kelvinApi) {
        this.kelvinApi = kelvinApi;
    }

    @Override
    public double getTemperatureCelsius() {
        double k = kelvinApi.getTemperatureKelvin();
        return (k - 32) * 5 / 9;
    }
}
