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
        double KW = 0;
        double CV, V, CF, MW, Pe;
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
                        System.out.println("1 - Kms");
                        System.out.println("2 - Metros.");
                        System.out.println("3 - Cms.");
                        System.out.println("4 - Pulgadas.");
                        System.out.println("5 - Yardas.");
                        System.out.println("6 - Pés.");
                        System.out.println("7 - Millas.");
                        System.out.println("8 - Millas náuticas.");
                        System.out.println("9 - Saír.");
                        System.out.println("0 - Volver al menú.");
                    } else if (opc == 2) {
                        System.out.println("1 - Vatio.");
                        System.out.println("2 - KW.");
                        System.out.println("3 - CV.");
                        System.out.println("4 - CF.");
                        System.out.println("5 - MW.");
                        System.out.println("6 - Pé.");
                        System.out.println("0 - Saír.");
                    } else {
                        System.out.println("1 - Celsius");
                        System.out.println("2 - Fahrenheit");
                        System.out.println("3 - Kelvin");
                        System.out.println("4 - Rankine");
                        System.out.println("5 - Delisle");
                        System.out.println("6 - Newton");
                        System.out.println("7 - Reámur");
                        System.out.println("8 - Romer");
                        System.out.println("0 - Saír");
                    }

                    opc2 = leer.nextInt();
                    switch (opc2) {
                        case 1:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Kilómetros que quiera convertir a Millas:");
                                distancia = leer.nextDouble();
                                double resul;
                                System.out.println("1 - Kms");
                                System.out.println("2 - Metros.");
                                System.out.println("3 - Cms.");
                                System.out.println("4 - Pulgadas.");
                                System.out.println("5 - Yardas.");
                                System.out.println("6 - Pés.");
                                System.out.println("7 - Millas.");
                                System.out.println("8 - Millas náuticas.");
                                System.out.println("9 - Saír.");
                                System.out.println("0 - Volver al menú.");
                                int opc3;
                                opc3 = leer.nextInt();
                                System.out.println("El resultado és: " + Luis.ConversorUnidades(distancia, opc2, opc3));
                            } else if (opc == 2) {
                                System.out.println("Introduzca la cantidad a convertir");
                                potencia = leer.nextDouble();
                                System.out.println("Escribe la opcion correcta");
                                System.out.println("1 - Vatio.");
                                System.out.println("2 - KW.");
                                System.out.println("3 - CV.");
                                System.out.println("4 - CF.");
                                System.out.println("5 - MW.");
                                System.out.println("6 - Pé.");
                                System.out.println("9 - Saír.");
                                int opc3 = leer.nextInt();
                                switch (opc3) {
                                    case 1:
                                        System.out.println("Has elegido la misma unidad");
                                        System.out.println("El resultado es " + potencia);
                                        break;
                                    case 2:
                                        System.out.println("Has elegido KW");
                                        Pablo.ConvesionVaKW(potencia);
                                        break;
                                    case 3:
                                        System.out.println("Has elegido CV");
                                        Pablo.ConversionCVaKW(potencia);
                                        break;
                                    case 4:
                                        System.out.println("Has elegido CF");
                                        Pablo.ConversionWaCF(potencia);
                                        break;
                                    case 5:
                                        System.out.println("Has elegido MW");
                                        Pablo.ConversionWaMW(potencia);
                                        break;
                                    case 6:
                                        System.out.println("Has elegido PE");
                                        Pablo.ConversionWaPE(potencia);
                                        break;
                                    case 9:
                                        System.out.println("volver al menú");
                                        break;
                                }
                            } else {
                                System.out.println("Introduzca la cantidad en Celsius que quiera convertir a Fahrenheit:");
                                temperatura = leer.nextDouble();
                                System.out.println("El resultado es "+Ivan.ConversorTemperatura(temperatura, opc, opc2));
                            }
                            break;

                        case 2:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Millas que quiera convertir a Kilómetros:");
                                distancia = leer.nextDouble();
                                System.out.println("1 - Kms");
                                System.out.println("2 - Metros.");
                                System.out.println("3 - Cms.");
                                System.out.println("4 - Pulgadas.");
                                System.out.println("5 - Yardas.");
                                System.out.println("6 - Pés.");
                                System.out.println("7 - Millas.");
                                System.out.println("8 - Millas náuticas.");
                                System.out.println("9 - Saír.");
                                System.out.println("0 - Volver al menú.");
                                int opc3;
                                opc3 = leer.nextInt();
                                System.out.println("El resultado és: " + Luis.ConversorUnidades(distancia, opc2, opc3));
                            } else if (opc == 2) {
                                System.out.println("Introduzca la cantidad a convertir");
                                potencia = leer.nextDouble();
                                potencia = potencia * 1000;
                                System.out.println("Escribe la opcion correcta");
                                System.out.println("1 - Vatio.");
                                System.out.println("2 - KW.");
                                System.out.println("3 - CV.");
                                System.out.println("4 - CF.");
                                System.out.println("5 - MW.");
                                System.out.println("6 - Pé.");
                                System.out.println("9 - Saír.");
                                int opc3 = leer.nextInt();
                                switch (opc3) {
                                    case 1:
                                        System.out.println("Has elegido Vatios");
                                        System.out.println("El resultado es " + potencia);
                                        break;
                                    case 2:
                                        System.out.println("Has elegido KW");
                                        System.out.println("El resultado es " + potencia / 1000);
                                        break;
                                    case 3:
                                        System.out.println("Has elegido CV");
                                        Pablo.ConversionCVaKW(potencia);
                                        break;
                                    case 4:
                                        System.out.println("Has elegido CF");
                                        Pablo.ConversionWaCF(potencia);
                                        break;
                                    case 5:
                                        System.out.println("Has elegido MW");
                                        Pablo.ConversionWaMW(potencia);
                                        break;
                                    case 6:
                                        System.out.println("Has elegido PE");
                                        Pablo.ConversionWaPE(potencia);
                                        break;
                                    case 9:
                                        System.out.println("volver al menú");
                                        break;
                                }
                            } else {
                                System.out.println("Introduzca la cantidad en Fahrenheit que quiera convertir a Celsius:");
                                temperatura = leer.nextDouble();

                                System.out.println("El resultado es "+Ivan.ConversorTemperatura(temperatura, opc, opc2));
                            }
                            break;

                        case 3:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Millas que quiera convertir a Pulgadas:");
                                distancia = leer.nextDouble();
                                System.out.println("1 - Kms");
                                System.out.println("2 - Metros.");
                                System.out.println("3 - Cms.");
                                System.out.println("4 - Pulgadas.");
                                System.out.println("5 - Yardas.");
                                System.out.println("6 - Pés.");
                                System.out.println("7 - Millas.");
                                System.out.println("8 - Millas náuticas.");
                                System.out.println("9 - Saír.");
                                System.out.println("0 - Volver al menú.");
                                int opc3;
                                opc3 = leer.nextInt();
                                System.out.println("El resultado és: " + Luis.ConversorUnidades(distancia, opc2, opc3));
                            } else if (opc == 2) {
                                System.out.println("Introduzca la cantidad a convertir");
                                potencia = leer.nextDouble();
                                potencia = potencia * 745.7;
                                System.out.println("Escribe la opcion correcta");
                                System.out.println("1 - Vatio.");
                                System.out.println("2 - KW.");
                                System.out.println("3 - CV.");
                                System.out.println("4 - CF.");
                                System.out.println("5 - MW.");
                                System.out.println("6 - Pé.");
                                System.out.println("9 - Saír.");
                                int opc3 = leer.nextInt();
                                switch (opc3) {
                                    case 1:
                                        System.out.println("Has elegido la misma unidad");
                                        System.out.println("El resultado es " + potencia);
                                        break;
                                    case 2:
                                        System.out.println("Has elegido KW");
                                        System.out.println("El resultado es " + potencia * 1000);
                                        break;
                                    case 3:
                                        System.out.println("Has elegido CV");
                                        Pablo.ConversionWaCV(potencia);
                                        break;
                                    case 4:
                                        System.out.println("Has elegido CF");
                                        Pablo.ConversionWaCF(potencia);
                                        break;
                                    case 5:
                                        System.out.println("Has elegido MW");
                                        Pablo.ConversionWaMW(potencia);
                                        break;
                                    case 6:
                                        System.out.println("Has elegido PE");
                                        Pablo.ConversionWaPE(potencia);
                                        break;
                                    case 9:
                                        System.out.println("volver al menú");
                                        break;
                                }
                            } else {
                                System.out.println("Introduzca la cantidad en Celsius que quiera convertir a Kelvin:");
                                temperatura = leer.nextDouble();

                                System.out.println("El resultado es "+Ivan.ConversorTemperatura(temperatura, opc, opc2));
                            }
                            break;

                        case 4:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Pulgadas que quiera convertir a Millas:");
                                distancia = leer.nextDouble();

                                System.out.println("1 - Kms");
                                System.out.println("2 - Metros.");
                                System.out.println("3 - Cms.");
                                System.out.println("4 - Pulgadas.");
                                System.out.println("5 - Yardas.");
                                System.out.println("6 - Pés.");
                                System.out.println("7 - Millas.");
                                System.out.println("8 - Millas náuticas.");
                                System.out.println("9 - Saír.");
                                System.out.println("0 - Volver al menú.");
                                int opc3;
                                opc3 = leer.nextInt();
                                System.out.println("El resultado és: " + Luis.ConversorUnidades(distancia,opc2, opc3));
                            } else if (opc == 2) {
                                System.out.println("Introduzca la cantidad a convertir");
                                potencia = leer.nextDouble();
                                System.out.println("Escribe la opcion correcta");
                                System.out.println("1 - Vatio.");
                                System.out.println("2 - KW.");
                                System.out.println("3 - CV.");
                                System.out.println("4 - CF.");
                                System.out.println("5 - MW.");
                                System.out.println("6 - Pé.");
                                System.out.println("9 - Saír.");
                                potencia = potencia * 745.7;
                                int opc3 = leer.nextInt();
                                switch (opc3) {
                                    case 1:
                                        System.out.println("Has elegido la misma unidad");
                                        System.out.println("El resultado es " + potencia);
                                        break;
                                    case 2:
                                        System.out.println("Has elegido KW");
                                        System.out.println("El resultado es " + potencia * 1000);
                                        break;
                                    case 3:
                                        System.out.println("Has elegido CV");
                                        Pablo.ConversionCVaKW(potencia);
                                        break;
                                    case 4:
                                        System.out.println("Has elegido CF");
                                        Pablo.ConversionWaCF(potencia);
                                        break;
                                    case 5:
                                        System.out.println("Has elegido MW");
                                        Pablo.ConversionWaMW(potencia);
                                        break;
                                    case 6:
                                        System.out.println("Has elegido PE");
                                        Pablo.ConversionWaPE(potencia);
                                        break;
                                    case 9:
                                        System.out.println("volver al menú");
                                        break;
                                }
                            } else {
                                System.out.println("Introduzca la cantidad en Kelvin que quiera convertir a Celsius:");
                                temperatura = leer.nextDouble();

                                System.out.println("El resultado es "+Ivan.ConversorTemperatura(temperatura, opc, opc2));
                            }
                            break;

                        case 5:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Pulgadas que quiera convertir a Millas:");
                                distancia = leer.nextDouble();

                                System.out.println("1 - Kms");
                                System.out.println("2 - Metros.");
                                System.out.println("3 - Cms.");
                                System.out.println("4 - Pulgadas.");
                                System.out.println("5 - Yardas.");
                                System.out.println("6 - Pés.");
                                System.out.println("7 - Millas.");
                                System.out.println("8 - Millas náuticas.");
                                System.out.println("9 - Saír.");
                                System.out.println("0 - Volver al menú.");
                                int opc3;
                                opc3 = leer.nextInt();
                                System.out.println("El resultado és: " + Luis.ConversorUnidades(distancia, opc2, opc3));
                            } else if (opc == 2) {
                                System.out.println("Introduzca la cantidad a convertir");
                                potencia = leer.nextDouble();
                                System.out.println("Escribe la opcion correcta");
                                System.out.println("1 - Vatio.");
                                System.out.println("2 - KW.");
                                System.out.println("3 - CV.");
                                System.out.println("4 - CF.");
                                System.out.println("5 - MW.");
                                System.out.println("6 - Pé.");
                                System.out.println("9 - Saír.");
                                potencia = potencia / 1000;
                                int opc3 = leer.nextInt();
                                switch (opc3) {
                                    case 1:
                                        System.out.println("Has elegido la misma unidad");
                                        System.out.println("El resultado es " + potencia);
                                        break;
                                    case 2:
                                        System.out.println("Has elegido KW");
                                        System.out.println("El resultado es " + potencia * 1000);
                                        break;
                                    case 3:
                                        System.out.println("Has elegido CV");
                                        Pablo.ConversionCVaKW(potencia);
                                        break;
                                    case 4:
                                        System.out.println("Has elegido CF");
                                        Pablo.ConversionWaCF(potencia);
                                        break;
                                    case 5:
                                        System.out.println("Has elegido MW");
                                        Pablo.ConversionWaMW(potencia);
                                        break;
                                    case 6:
                                        System.out.println("Has elegido PE");
                                        Pablo.ConversionWaPE(potencia);
                                        break;
                                    case 9:
                                        System.out.println("volver al menú");
                                        break;
                                }
                            } else {
                                System.out.println("Introduzca la cantidad en Kelvin que quiera convertir a Celsius:");
                                temperatura = leer.nextDouble();

                                System.out.println("El resultado es "+Ivan.ConversorTemperatura(temperatura, opc, opc2));
                            }
                            break;

                        case 6:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Pulgadas que quiera convertir a Millas:");
                                distancia = leer.nextDouble();

                                System.out.println("1 - Kms");
                                System.out.println("2 - Metros.");
                                System.out.println("3 - Cms.");
                                System.out.println("4 - Pulgadas.");
                                System.out.println("5 - Yardas.");
                                System.out.println("6 - Pés.");
                                System.out.println("7 - Millas.");
                                System.out.println("8 - Millas náuticas.");
                                System.out.println("9 - Saír.");
                                System.out.println("0 - Volver al menú.");
                                int opc3;
                                opc3 = leer.nextInt();
                                System.out.println("El resultado és: " + Luis.ConversorUnidades(distancia,opc2, opc3));
                            } else if (opc == 2) {
                                System.out.println("Introduzca la cantidad a convertir");
                                potencia = leer.nextDouble();
                                System.out.println("Escribe la opcion correcta");
                                System.out.println("1 - Vatio.");
                                System.out.println("2 - KW.");
                                System.out.println("3 - CV.");
                                System.out.println("4 - CF.");
                                System.out.println("5 - MW.");
                                System.out.println("6 - Pé.");
                                System.out.println("9 - Saír.");
                                potencia = potencia * 1.36;
                                int opc3 = leer.nextInt();
                                switch (opc3) {
                                    case 1:
                                        System.out.println("Has elegido la misma unidad");
                                        System.out.println("El resultado es " + potencia);
                                        break;
                                    case 2:
                                        System.out.println("Has elegido KW");
                                        System.out.println("El resultado es " + potencia * 1000);
                                        break;
                                    case 3:
                                        System.out.println("Has elegido CV");
                                        Pablo.ConversionCVaKW(potencia);
                                        break;
                                    case 4:
                                        System.out.println("Has elegido CF");
                                        Pablo.ConversionWaCF(potencia);
                                        break;
                                    case 5:
                                        System.out.println("Has elegido MW");
                                        Pablo.ConversionWaMW(potencia);
                                        break;
                                    case 6:
                                        System.out.println("Has elegido PE");
                                        Pablo.ConversionWaPE(potencia);
                                        break;
                                    case 9:
                                        System.out.println("volver al menú");
                                        break;
                                }
                            } else {
                                System.out.println("Introduzca la cantidad en Kelvin que quiera convertir a Celsius:");
                                temperatura = leer.nextDouble();

                                   System.out.println("El resultado es "+Ivan.ConversorTemperatura(temperatura, opc, opc2));

                            }
                            break;
                        case 7:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Pulgadas que quiera convertir a Millas:");
                                distancia = leer.nextDouble();
                                System.out.println("1 - Kms");
                                System.out.println("2 - Metros.");
                                System.out.println("3 - Cms.");
                                System.out.println("4 - Pulgadas.");
                                System.out.println("5 - Yardas.");
                                System.out.println("6 - Pés.");
                                System.out.println("7 - Millas.");
                                System.out.println("8 - Millas náuticas.");
                                System.out.println("9 - Saír.");
                                System.out.println("0 - Volver al menú.");
                                int opc3;
                                opc3 = leer.nextInt();
                                System.out.println("El resultado és: " + Luis.ConversorUnidades(distancia, opc2, opc3));
                            } else {
                                System.out.println("Introduzca la cantidad en Kelvin que quiera convertir a Celsius:");
                                temperatura = leer.nextDouble();

                                System.out.println("El resultado es "+Ivan.ConversorTemperatura(temperatura, opc, opc2));
                            }
                            break;
                        case 8:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Pulgadas que quiera convertir a Millas:");
                                distancia = leer.nextDouble();
                                System.out.println("1 - Kms");
                                System.out.println("2 - Metros.");
                                System.out.println("3 - Cms.");
                                System.out.println("4 - Pulgadas.");
                                System.out.println("5 - Yardas.");
                                System.out.println("6 - Pés.");
                                System.out.println("7 - Millas.");
                                System.out.println("8 - Millas náuticas.");
                                System.out.println("9 - Saír.");
                                System.out.println("0 - Volver al menú.");
                                int opc3;
                                opc3 = leer.nextInt();
                                System.out.println("El resultado és: " + Luis.ConversorUnidades(distancia, opc2, opc3));
                            } else {
                                System.out.println("Introduzca la cantidad en Kelvin que quiera convertir a Celsius:");
                                temperatura = leer.nextDouble();

                                System.out.println("El resultado es "+Ivan.ConversorTemperatura(temperatura, opc, opc2));
                            }
                            break;
                        case 9:
                            if (opc == 1) {
                                System.out.println("Introduzca la cantidad en Pulgadas que quiera convertir a Millas:");
                                distancia = leer.nextDouble();
                                System.out.println("1 - Kms");
                                System.out.println("2 - Metros.");
                                System.out.println("3 - Cms.");
                                System.out.println("4 - Pulgadas.");
                                System.out.println("5 - Yardas.");
                                System.out.println("6 - Pés.");
                                System.out.println("7 - Millas.");
                                System.out.println("8 - Millas náuticas.");
                                System.out.println("9 - Saír.");
                                System.out.println("0 - Volver al menú.");
                                int opc3;
                                opc3 = leer.nextInt();
                                System.out.println("El resultado és: " + Luis.ConversorUnidades(distancia, opc2, opc3));
                            } else {
                                System.out.println("Introduzca la cantidad en Kelvin que quiera convertir a Celsius:");
                                temperatura = leer.nextDouble();

                                System.out.println("El resultado es "+Ivan.ConversorTemperatura(temperatura, opc, opc2));
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
