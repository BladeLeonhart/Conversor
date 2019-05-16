
package conversor;

public class Lonxitude {
    
    private double Km;
    private double Millas;
    private double Pulgadas;

    public Lonxitude() {
    }
    
    
    public Double KilometrosMillas(double Km){
        double Millas;
        Millas = Km * 0.621;
        return Millas;
    }
    
    public Double MillasKilometros(double Millas){
        double Km;
        Km = Millas * 1.61;
        return Km;  
    }
    
    public Double MillasPulgadas(double Millas){
        double Pulgadas;
        Pulgadas = Millas * 63360;
        return Pulgadas;    
    }
    
    public Double PulgadasMillas(double Pulgadas){
        double Millas;
        Millas = Pulgadas * 0.00001578;
        return Millas; 
    }
    
 
    
}


