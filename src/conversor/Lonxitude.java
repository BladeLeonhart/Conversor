package conversor;

/**
 *
 * @author DAM117
 */
public class Lonxitude {

    /**
     *
     */
    public Lonxitude() {
    }

    /**
     *
     */
    public double Km;

    /**
     *
     */
    public double Millas;

    /**
     *
     */
    public double Pulgadas;

    /**
     *
     * @param Km
     */
    public void KilometrosMillas(double Km) {
        double Millas;
        Millas = Km * 0.621;
        System.out.println(Km + " Son " + Millas);
    }

    /**
     *
     * @param Millas
     */
    public void MillasKilometros(double Millas) {
        double Km;
        Km = Millas * 1.61;
        System.out.println(Millas + " Son " + Km);
    }

    /**
     *
     * @param Millas
     */
    public void MillasPulgadas(double Millas) {
        double Pulgadas;
        Pulgadas = Millas * 63360;
        System.out.println(Millas + " Son " + Pulgadas);
    }

    /**
     *
     * @param Pulgadas
     */
    public void PulgadasMillas(double Pulgadas) {
        double Millas;
        Millas = Pulgadas * 0.00001578;
        System.out.println(Pulgadas + " Son " + Millas);
    }

}
