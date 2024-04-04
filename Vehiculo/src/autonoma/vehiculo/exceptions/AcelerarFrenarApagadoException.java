package Autonoma.Vehiculo.Exceptions;

/**
 * @since 20240404
 * @version 1.0.0
 * @author Abraham Velasquez
 * @author Aglae Duin
 */
public class AcelerarFrenarApagadoException extends RuntimeException{
    /**
     *Esta exception es cuando el vehiculo intente frenar o acelerar apagado, dejando recordatorio que el vehiculo no esta encendido
     * @param mensaje 
     */
    public AcelerarFrenarApagadoException(String mensaje) {
        super(mensaje);
    }
    
}
