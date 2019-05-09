
package conversor;

public class Lonxitude {
    
    private double Km;
    private double Millas;
    private double Pulgadas;

    public Lonxitude() {
    }
    
    
    public String KilometrosMillas(double Km){
        double Millas;
        Millas = Km * 0.621;
        return Km+"Son "+Millas;
    }
    
    public String MillasKilometros(double Millas){
        double Km;
        Km = Millas * 1.61;
        return Millas+"Son "+Km;    
    }
    
    public String MillasPulgadas(double Millas){
        double Pulgadas;
        Pulgadas = Millas * 63360;
        return Millas+"Son "+Pulgadas;    
    }
    
    public String PulgadasMillas(double Pulgadas){
        double Millas;
        Millas = Pulgadas * 0.00001578;
        return Pulgadas+"Son "+Millas;    
    }
    
 
    
}


