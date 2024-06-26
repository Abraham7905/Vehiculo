package autonoma.Vehiculo.exceptions;
/**
 * @since 20240404
 * @version 1.0.0
 * @author Abraham Velasquez
 * @author Aglae Duin
 */ 
public class MotorLimiteException extends RuntimeException{
/**
 * Si el motor del vehiculo acelera a una velocidad por encima de su limite, este se accidentara soltando un mensaje
 */
    public MotorLimiteException() {
        super("La velocidad excedió el limite permitido por el motor");
    }
    
}
