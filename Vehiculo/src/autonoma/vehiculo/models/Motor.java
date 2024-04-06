
package Autonoma.Vehiculo.Models;

import Autonoma.Vehiculo.Exceptions.ApagadoNuevamenteException;
import autonoma.vehiculo.exceptions.EncendidoNuevamenteException;
import javax.swing.JOptionPane;

/**
 *Esta es la clase Motor
 * @since 20240331
 * @version 0.0.1
 * @author Abraham Velasquez 
 * @author Aglae Duin
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
        this.estado = false;
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
     *
    
     */
     public void encender() {
         try{
             if(estado != true){
             this.estado = true;
                }
         } catch (EncendidoNuevamenteException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
         
        
    }
    /**
     * Modifica el estado del vehiculo 
     * 
     */
    public void apagar(){
        try {
            if(estado == true){
         this.estado = false;
        }
        } catch (ApagadoNuevamenteException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
     
    }
        
    
    
   
    
    
}
