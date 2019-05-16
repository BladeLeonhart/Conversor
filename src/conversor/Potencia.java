package conversor;

/**
 *
 * @author DAM117
 */
public class Potencia {

    /**
     *
     */
    public Potencia() {
    }

    private double KW;
    private double CV;
    private double FtLB;

    /**
     *
     * @param KW
     */
    public void ConversionKWaCV(double KW) {
        double CV;
        CV = KW * 1.36;
        System.out.println(KW + "KW a CV son " + CV);
    }

    /**
     *
     * @param CV
     */
    public void ConversionCVaKW(double CV) {
        double KW;
        KW = CV * 0.736;
        System.out.println(CV + "CV a KW son " + KW); 
    }

    /**
     *
     * @param KW
     */
    public void ConversionKWaFTLB(double KW) {
        double FTLB;
        FTLB = KW * 737.562149;
        System.out.println(KW + "KW a FTLB son " + FTLB); 
    }

    /**
     *
     * @param FTLB
     */
    public void ConversionFTLBaKW(double FTLB) {
        double KW;
        KW = FTLB / 737.562149;
        System.out.println(FTLB + "FTLB a KW son " + KW);
    }

}
