
package autonoma.Vehiculo.models;

/**
 *Esta es la clase Llanta
 * @since 20240331
 * @version 0.0.1
 * @author Abraham Velasquez
 * @author aduin
 */
public class Llanta {
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Atributos
    /**
     * nombreTipo: Nombre del tipo de llanta
     */
    private String nombreTipo;
    /**
     * limite: Es la velocidad maxima permitida para cada tipo de llanta
     */
    private int limite;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Método constructor
    /**
     * 
     * @param nombreTipo
     * @param limite 
     */
    public Llanta(String nombreTipo, int limite) {
        this.nombreTipo = nombreTipo;
        this.limite = limite;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Métodos de Acceso
    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
}

