package conversor;

public class Potencia {

    private double KW;
    private double CV;
    private double FtLB;

    private void Potenica() {
    }

    private void ConversionKWaCV(double KW) {
        double CV;
        CV = KW * 1.36;
        System.out.println(KW + "KW a CV son " + CV);
    }

    private void ConversionCVaKW(double CV) {
        double KW;
        KW = CV * 0.736;
        System.out.println(CV + "CV a KW son " + KW);
    }

    private void ConversionKWaFTLB(double KW) {
        double FTLB;
        FTLB = KW * 737.562149;
        System.out.println(KW + "KW a FTLB son " + FTLB);
    }

    private void ConversionFTLBaKW(double FTLB) {
        double KW;
        KW = FTLB / 737.562149;
        System.out.println(FTLB + "FTLB a KW son " + KW);
    }

}
