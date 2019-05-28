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

    private void Potenica() {
    }

 
    /**
     *
     * @param KW
     */
    public void ConvesionVaKW(double V) {
        System.out.println("El resultado es" + V / 1000);
    }

    public void ConversionKWaCV(double KW) {
        double CV;
        CV = KW * 1.36;
        System.out.println(KW + " el resultado es " + CV);
    }

    public void ConversionWaCV(double V) {
        double CV;
        CV = V / 745.7;
        System.out.println(KW + " el resultado es " + CV);
    }

    /**
     *
     * @param CV
     */
    public void ConversionCVaKW(double CV) {
        double KW;
        KW = CV * 0.745;
        System.out.println(" el resultado es " + KW);
    }

    /**
     *
     * @param KW
     */
    public void ConversionKWaFTLB(double KW) {
        double FTLB;
        FTLB = KW * 737.562149;
        System.out.println(KW + " el resultado es " + FTLB);
    }

    /**
     *
     * @param FTLB
     */
    public void ConversionFTLBaKW(double FTLB) {
        double KW;
        KW = FTLB / 737.562149;
        System.out.println(FTLB + " el resultado es " + KW);
    }

    public void ConversionWaMW(double W) {
        double MW;
        MW = W * 1000;
        System.out.println(W + " el resultado es " + MW);
    }

    public void ConversionWaCF(double W) {
        double CF;
        CF = W / 745.7 ;
        System.out.println(KW + " el resultado es " + CF);
    }

    public void ConversionWaPE(double W) {
        double CF;
        CF = W / 1.36;
        System.out.println(KW + " el resultado es " + CF);
    }
}
