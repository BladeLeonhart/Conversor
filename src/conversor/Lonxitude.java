package conversor;

public class Lonxitude {

    public Lonxitude() {
    }

    public double Km;
    public double Millas;
    public double Pulgadas;

    public String KilometrosMillas(double Km) {
        double Millas;
        Millas = Km * 0.621;
        return Km + "Son " + Millas;
    }

    public String MillasKilometros(double Millas) {
        double Km;
        Km = Millas * 1.61;
        return Millas + "Son " + Km;
    }

    public String MillasPulgadas(double Millas) {
        double Pulgadas;
        Pulgadas = Millas * 63360;
        return Millas + "Son " + Pulgadas;
    }

    public String PulgadasMillas(double Pulgadas) {
        double Millas;
        Millas = Pulgadas * 0.00001578;
        return Pulgadas + "Son " + Millas;
    }

    public void Mostrar(int num) {
        System.out.println("1. Transformar Kms a Millas\n"
                + "2. Transformar Millas a Kms"
                + "3. Transformar Millas a Pulgadas"
                + "4. Transformar Pulgadas a Millas"
                + "0. Volver ó menú anterior");
        switch (num) {
            case 1:
                KilometrosMillas(Km);
                break;
            case 2:
                MillasKilometros(Millas);
                break;
            case 3:
                MillasPulgadas(Millas);
                break;
            case 4:
                PulgadasMillas(Pulgadas);
                break;
        }
        System.out.println("Fin xD");
    }

}
