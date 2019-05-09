package conversor;

public class Potencia {

    private void Conversion(int num,double KW,double CV,double FTLB) {
        System.out.println("A continuación le aparecerá las opciones a elegir");
        System.out.println("1. KW a CV\n"
                + "2. CV a KW\n"
                + "3. KW a Ft/Lb\n"
                + "4. Ft/Lb a KW\n"
                + "0. Volver ó menú anterior");
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
        }
    }
}
