package conversor;

import java.util.Scanner;

/**
 *
 * @author Blade
 */
public class Temperatura {

    Scanner read = new Scanner(System.in);

    public void ConversorTemperatura() {
        int conver = 1;
        double valor=0;

        while (conver != 0) {
            System.out.println("Interfaz Temperatura\n "
            + "1. Celsius a Fahrenheit\n" +
            "\n" +
            "2. Fahrenheit a Celsius\n" +
            "\n" +
            "3. Celsius a Kelvin\n" +
            "\n" +
            "4. Kelvin a Celsius\n" +
            "\n" +
            "0. Volver ó menú anterior");
            conver = read.nextInt();
            switch (conver) {
                case 1: 
                    valor=read.nextDouble();
                    valor=(valor*9/5)+32;
                    break;
                case 2:
                    valor=read.nextDouble();
                    valor=(valor-32)*5/9;
                    break;
                case 3:
                    valor=read.nextDouble();
                    valor=valor+273.15;
                    break;
                case 4:
                    valor=read.nextDouble();
                    valor=valor-273.15;
                    break;
                case 0:
                    break;
            }
        }
    }
}
