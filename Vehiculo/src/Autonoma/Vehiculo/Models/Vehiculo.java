
package Autonoma.Vehiculo.Models;

/**
 * Esta es la clase Vehiculo
 *@since 20240331
 * @version 0.0.1
 * @author Abraham Velasquez 
 */
public class Vehiculo {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Atributos
    /**
     * marca: Nombre de la marca del vehiculo
     */
    private String marca;
    /**
     * añoFabricado: Año en la que el vehiculo fue fabricado
     */
    private String añoFabricado;
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Método Constructor
    /**
     * 
     * @param marca
     * @param añoFabricado 
     */
    public Vehiculo (String marca, String añoFabricado){
    this.marca = marca;
    this.añoFabricado = añoFabricado;
    }
    
    
}
