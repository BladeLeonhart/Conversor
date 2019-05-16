package conversor;

import java.util.Scanner;

/**
 *
 * @author DAM117
 * 
 */
public class Conversor {

    static Potencia Pablo = new Potencia();
    static Temperatura Ivan = new Temperatura();
    static Lonxitude Luis = new Lonxitude();

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc = 10;
        Lonxitude Luis = new Lonxitude();
        Potencia Pablo = new Potencia();
        Temperatura Ivan = new Temperatura();

        do {
            System.out.println("Ingrese la opción que desea:");

            System.out.println("1 - Transformar Lonxitude.");
            System.out.println("2 - Transformar Potencia.");
            System.out.println("3 - Transformar Temperatura.");
            System.out.println("0 - Saír.");

            opc = leer.nextInt();
            int opc2 = 0;
            double distancia, temperatura, potencia;

            if (opc > 0 && opc <= 3) {
                do {
                    System.out.println("Ingrese la opción que desea:");

                    if (opc == 1) {
                        System.out.println("1 - Kilómetros a Millas.");
                        System.out.println("2 - Millas a Kilómetros.");
                        System.out.println("3 - Millas a Pulgadas.");
                        System.out.println("4 - Pulgadas a Millas.");
                        System.out.println("0 - Volver al menú.");
                    } else if (opc == 2) {
                        System.out.println("1 - KW a CV.");
                        System.out.println("2 - CV a KW.");
                        System.out.println("3 - KW a Ft/Lb.");
                        System.out.println("4 - Ft/Lb a KW.");
                        System.out.println("0 - Volver al menú.");
                    } else {
                        System.out.println("1 - Celsius a Fahrenheit.");
                        System.out.println("2 - Fahrenheit a Celsius.");
                        System.out.println("3 - Celsius a Kelvin.");
                        System.out.println("4 - Kelvin a Celsius.");
                        System.out.println("0 - Volver al menú.");
                    }

                    opc2 = leer.nextInt();
                    switch (opc2) {
                        case 1:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Kilómetros que quiera convertir a Millas:");
                                distancia = leer.nextDouble();
                                double resul;
                                Luis.KilometrosMillas(distancia);
                            } else if (opc == 2) {
                                System.out.println("Introduzca la cantidad en KW que quiera convertir a CV:");
                                potencia = leer.nextDouble();
                                Pablo.ConversionKWaCV(potencia);
                            } else {
                                System.out.println("Introduzca la cantidad en Celsius que quiera convertir a Fahrenheit:");
                                temperatura = leer.nextDouble();
                                Ivan.CelsiusaFahrenheit(temperatura);
                            }
                            break;

                        case 2:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Millas que quiera convertir a Kilómetros:");
                                distancia = leer.nextDouble();
                                Luis.MillasKilometros(distancia);
                            } else if (opc == 2) {
                                System.out.println("Introduzca la cantidad en CV que quiera convertir a KW:");
                                potencia = leer.nextDouble();
                                Pablo.ConversionCVaKW(potencia);
                            } else {
                                System.out.println("Introduzca la cantidad en Fahrenheit que quiera convertir a Celsius:");
                                temperatura = leer.nextDouble();

                                Ivan.FahrenheitaCelsius(temperatura);
                            }
                            break;

                        case 3:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Millas que quiera convertir a Pulgadas:");
                                distancia = leer.nextDouble();
                                Luis.MillasPulgadas(distancia);
                            } else if (opc == 2) {
                                System.out.println("Introduzca la cantidad en KW que quiera convertir a Ft/Lb:");
                                potencia = leer.nextDouble();

                                Pablo.ConversionKWaFTLB(potencia);
                            } else {
                                System.out.println("Introduzca la cantidad en Celsius que quiera convertir a Kelvin:");
                                temperatura = leer.nextDouble();

                                Ivan.CelsiusaKelvin(temperatura);
                            }
                            break;

                        case 4:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Pulgadas que quiera convertir a Millas:");
                                distancia = leer.nextDouble();

                                Luis.PulgadasMillas(distancia);
                            } else if (opc == 2) {
                                System.out.println("Introduzca la cantidad en Ft/Lb que quiera convertir a KW:");
                                potencia = leer.nextDouble();

                                Pablo.ConversionFTLBaKW(potencia);
                            } else {
                                System.out.println("Introduzca la cantidad en Kelvin que quiera convertir a Celsius:");
                                temperatura = leer.nextDouble();

                                Ivan.KelvinaCeslsius(temperatura);
                            }
                            break;
                        case 0:
                            System.out.println("Volver al menú");
                            break;
                    }
                } while (opc2 != 0);
            } else if (opc == 0) {
                System.out.println("Has salido del programa");
            } else {
                System.out.println("Pon un número correcto");
            };

        } while (opc != 0);
    }
}
