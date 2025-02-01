package br.ufpr.lpoo.tarefa05.exercicio8;

public class Temperatura {
    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitParaKelvin(double fahrenheit) {
        return celsiusParaKelvin(fahrenheitParaCelsius(fahrenheit));
    }

    public static double kelvinParaFahrenheit(double kelvin) {
        return celsiusParaFahrenheit(kelvinParaCelsius(kelvin));
    }
}
