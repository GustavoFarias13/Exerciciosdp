package com.gustavofarias.exerciciosopcionais.adapter.weatherapi;

public class MainWeather {
    public static void main(String[] args) {
        ClimaService clima1 = new FahrenheitApiAdapter(new FahrenheitApi());
        System.out.println("Temperatura em Celsius (Fahrenheit Api): " + clima1.getTemperatureCelsius());

        ClimaService clima2 = new KelvinApiAdapter(new KelvinApi());
        System.out.println("Temperatura em Celsius (Kelvin Api): " + clima2.getTemperatureCelsius());
    }
}
