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
        double valor = 0;

        while (conver != 0) {
            System.out.println("Interfaz Temperatura\n "
                    + "1. Celsius a Fahrenheit\n"
                    + "\n"
                    + "2. Fahrenheit a Celsius\n"
                    + "\n"
                    + "3. Celsius a Kelvin\n"
                    + "\n"
                    + "4. Kelvin a Celsius\n"
                    + "\n"
                    + "0. Volver ó menú anterior");
            conver = read.nextInt();
            switch (conver) {
                case 1:
                    System.out.println("Ingrese o valor a convertir: ");
                    valor = read.nextDouble();
                    System.out.println(valor+" grados celsius son: ");
                    valor = (valor * 9 / 5) + 32;
                    System.out.println(valor+" grados fahrenheit.");
                    break;
                case 2:
                    System.out.println("Ingrese o valor a convertir: ");
                    valor = read.nextDouble();
                    System.out.println(valor+" grados fahrenheit son: ");
                    valor = (valor - 32) * 5 / 9;
                    System.out.println(valor+" grados celsius");
                    break;
                case 3:
                    System.out.println("Ingrese o valor a convertir: ");
                    valor = read.nextDouble();
                    System.out.println(valor+" grados celsius son:");
                    valor = valor + 273.15;
                    System.out.println(valor+" grados kelvin");
                    break;
                case 4:
                    System.out.println("Ingrese o valor a convertir: ");
                    valor = read.nextDouble();
                    System.out.println(valor+" grados kelvin son:");
                    valor = valor - 273.15;
                    System.out.println(valor+" grados celsius");
                    break;
                case 0:
                    break;
            }
        }
    }
}
