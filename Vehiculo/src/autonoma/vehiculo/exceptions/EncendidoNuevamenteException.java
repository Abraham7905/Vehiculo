package autonoma.vehiculo.exceptions;
/**
 *@version 1.0.0
 *@since 20240404
 * @author Abraham Velasquez
 * @author Aglae Duin
 */
public class EncendidoNuevamenteException extends Exception {
    /**
     * Esta exception me servira para advertir que el vehiculo ya esta encendido y no puede ser encendido de nuevo
     * @param message 
     */
    public EncendidoNuevamenteException(String message) {
        super(message);
    }
    
}
