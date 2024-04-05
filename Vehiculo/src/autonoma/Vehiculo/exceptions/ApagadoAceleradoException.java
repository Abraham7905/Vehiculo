package autonoma.Vehiculo.exceptions;
/**
 * @since 20240404
 * @version 1.0.0
 * @author Abraham Velasquez
 * @author Aglae Duin
 */ 
public class ApagadoAceleradoException extends RuntimeException{
    /**
     * Si el vehiculo esta acelerando a mas de 60km/h y se apaga repentinamente este se accidentara
     * @param message 
     */
    public ApagadoAceleradoException(String message) {
        super(message);
    }
    
}
