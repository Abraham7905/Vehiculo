
package autonoma.vehiculo.models;

/**
 *Esta es la clase Motor
 * @since 20240331
 * @version 0.0.1
 * @author Abraham Velasquez
 */
public class Motor {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Atributos
    /**
     * cilindraje: Nombre del cilindraje
     */
    private String cilindraje;
    /**
     * velocidadMax: Velocidad máxima para cada cilindraje
     */
    private int velocidadMax;
    /**
     * estado: Estado en la que se encuentra el vehiculo
     */
    private boolean estado;
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Método Constructor 
    /**
     * 
     * @param cilindraje
     * @param velocidadMax
     * @param estado 
     */
    public Motor(String cilindraje, int velocidadMax, boolean estado) {
        this.cilindraje = cilindraje;
        this.velocidadMax = velocidadMax;
        this.estado = estado;
    }
        
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Métodos de Acceso
    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Métodos Modificadores
    /**
     * Modifica el estado del vehiculo 
     * @param encendido 
     */
     public void encender(boolean encendido){
        this.estado = true;
    }
    /**
     * Modifica el estado del vehiculo 
     * @param apagado 
     */
    public void apagar(boolean apagado){
        this.estado = false;
    }
    
    
}
