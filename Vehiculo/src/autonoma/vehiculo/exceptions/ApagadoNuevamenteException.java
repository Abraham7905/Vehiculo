package Autonoma.Vehiculo.Exceptions;

/**
 * @since 20240404
 * @version 1.0.0
 * @author Abraham Velasquez
 * @author Aglae Duin
 */
public class ApagadoNuevamenteException extends RuntimeException {
    /**
     * Esta exception es cuando el vehiculo este apagado, no apagarse nuevamente
     */
    public ApagadoNuevamenteException() {
        super("No puedes apagar nuevamente el vehiculo");
    }
    
    
}
