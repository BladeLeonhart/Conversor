package conversor;

import java.util.Scanner;

/**
 *
 * @author Blade
 */
public class Temperatura {

    public Temperatura() {
    }

    Scanner read = new Scanner(System.in);

    public void CelsiusaFahrenheit(double Celsius) {
        double resultado;
        resultado = (Celsius * 9 / 5) + 32;
        System.out.println(Celsius + " ceslius son: " + resultado + " fahrenheit");
    }

    public void FahrenheitaCelsius(double Faren) {
        double resultado;
        resultado = (Faren - 32) * 5 / 9;
        System.out.println(Faren + " fahrenheit son: " + resultado + " ceslius");

    }

    public void CelsiusaKelvin(double ndCelsius) {
        double resultado;
        resultado = ndCelsius + 273.15;
        System.out.println(ndCelsius + " celsius son: " + resultado + " kelvin");
    }

    public void KelvinaCeslsius(double Kelvin) {
        double resultado;
        resultado = Kelvin - 273.15;
        System.out.println(Kelvin + " kelvin son: " + resultado + " celsius");
    }
}
