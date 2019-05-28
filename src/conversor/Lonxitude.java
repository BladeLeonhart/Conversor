package conversor;

/**
 *
 * @author DAM117
 */

public class Lonxitude {

    public double ConversorUnidades(double distancia, int opc1, int opc2) {
        double[] conversor1 = {0,1,0.001, 0.00001, 0.0000254, 0.0009144, 0.0003048, 1.6093, 1.8520};
        double[] conversor2 = {0,1, 1000, 1000000, 39370.052, 370.10, 1, 093.61, 3, 280.84, 0.6214, 0.5400};
        distancia = ((distancia*conversor1[opc1])*conversor2[opc2]); 
        return distancia;
    }
}
