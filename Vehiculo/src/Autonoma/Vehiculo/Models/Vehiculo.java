
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
    /**
     * velocidadActual: Velocidad actual del vehiculo
     */
    private int velocidadActual;
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Método Constructor
    /**
     * 
     * @param marca
     * @param añoFabricado
     * @param velocidadActual 
     */
    public Vehiculo (String marca, String añoFabricado, int velocidadActual){
    this.marca = marca;
    this.añoFabricado = añoFabricado;
    this.velocidadActual = velocidadActual;
    }
    
    public Vehiculo(){
        this.marca = "";
        this.añoFabricado = "";
        this.velocidadActual = 0;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Métodos de Acesso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAñoFabricado() {
        return añoFabricado;
    }

    public void setAñoFabricado(String añoFabricado) {
        this.añoFabricado = añoFabricado;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Métodos Modificadores
    public void acelerar(int velocidad){
        this.setVelocidadActual (this.getVelocidadActual() + velocidad);
    }
    
     public void frenar (int velocidad){
        this.setVelocidadActual (0);
    }
    
    
}
