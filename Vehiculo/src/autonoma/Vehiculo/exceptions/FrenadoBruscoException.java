package autonoma.Vehiculo.exceptions;
/**
 * @since 20240404
 * @version 1.0.0
 * @author Abraham Velasquez
 * @author Aglae Duin
 */
public class FrenadoBruscoException extends RuntimeException{
    /**
     * Si el vehiculo esta en movimiento y sobrepasa el limite de frenado, cuando se realice el frenado brusco repentino, este saldra patinado 
     * @param message 
     */
    public FrenadoBruscoException(String message) {
        super(message);
    }
}
