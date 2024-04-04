package Autonoma.Vehiculo.Exceptions;
/**
 * @since 20240404
 * @version 1.0.0
 * @author Abraham Velasquez
 * @author Aglae Duin
 */ 
public class FrenarVelocidadLimiteException extends RuntimeException {
    /**
     * Si el vehiculo frena al limite de su velocidad actual, este soltara un mensaje de que esta patinando
     * @param message
     */

    public FrenarVelocidadLimiteException(String message) {
        super(message);
    }
    
}
