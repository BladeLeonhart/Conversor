/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Scanner;

/**
 *
 * @author DAM117
 */
public class Conversor {

    static Potencia Pablo = new Potencia();
    static Temperatura Ivan = new Temperatura();
    static Lonxitude Luis = new Lonxitude();

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Interfaz principal:\n"
                + "\n"
                + "1. Transformar Lonxitude\n"
                + "\n"
                + "2. Transformar Potencia\n"
                + "\n"
                + "3. Transformar Temperatura\n"
                + "\n"
                + "0. Saír");
        int interfaz = read.nextInt();
        int output = -1;

        switch (interfaz) {
            case 1:
                System.out.println("1. Transformar Kms a Millas\n"
                        + "2. Transformar Millas a Kms\n"
                        + "3. Transformar Millas a Pulgadas\n"
                        + "4. Transformar Pulgadas a Millas\n"
                        + "0. Volver ó menú anterior\n");
                int num = read.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Introduce valor");
                        double Km = read.nextDouble();
                        Luis.KilometrosMillas(Km);
                        break;
                    case 2:
                        System.out.println("Introduce valor");
                        double Millas = read.nextDouble();
                        Luis.MillasKilometros(Millas);
                        break;
                    case 3:
                        System.out.println("Introduce valor");
                        double Millas2 = read.nextDouble();
                        Luis.MillasPulgadas(Millas2);
                        break;
                    case 4:
                        System.out.println("Introduce valor");
                        double Pulgadas = read.nextDouble();
                        Luis.PulgadasMillas(Pulgadas);
                        break;
                }
                break;
            case 2:
                System.out.println("A continuación le aparecerá las opciones a elegir");
                System.out.println("1. KW a CV\n"
                        + "2. CV a KW\n"
                        + "3. KW a Ft/Lb\n"
                        + "4. Ft/Lb a KW\n"
                        + "0.Mover de Salir");
                break;
            case 3:
                break;
            case 0:
                return;
        }
    }

}
