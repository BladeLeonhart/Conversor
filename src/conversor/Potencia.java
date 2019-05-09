package conversor;

import java.util.Scanner;

public class Potencia {

    public Potencia() {
    }

    public static void Conversion(double KW, double CV, double FTLB) {
        Scanner read = new Scanner(System.in);
        System.out.println("A continuación le aparecerá las opciones a elegir");
        System.out.println("1. KW a CV\n"
                + "2. CV a KW\n"
                + "3. KW a Ft/Lb\n"
                + "4. Ft/Lb a KW\n"
                + "0. Volver ó menú anterior");
        int num = read.nextInt();

        switch (num) {
            case 1:
                CV = KW * 1.36;
                System.out.println(KW + "KW a CV son " + CV);
                break;
            case 2:
                KW = CV * 0.736;
                System.out.println(CV + "CV a KW son " + KW);
                break;
            case 3:
                FTLB = KW * 737.562149;
                System.out.println(KW + "KW a FTLB son " + FTLB);
                break;
            case 4:
                KW = FTLB / 737.562149;
                System.out.println(FTLB + "FTLB a KW son " + KW);
                break;
            case 0:
                System.out.println("Has elegido terminar, el programa finalizará");
                return;
        }
    }
}
