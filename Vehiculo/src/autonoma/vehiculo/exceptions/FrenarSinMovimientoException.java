package Autonoma.Vehiculo.Exceptions;
/**
 * @since 20240404
 * @version 1.0.0
 * @author Abraham Velasquez
 * @author Aglae Duin
 */
public class FrenarSinMovimientoException extends RuntimeException {
    /**
     * Esta exception muestra la nularidad de un frenado mientras el carro no esta en movimiento
     * 
     */
    public FrenarSinMovimientoException() {
        super("No puedes frenar sin Movimiento");
    }
}
