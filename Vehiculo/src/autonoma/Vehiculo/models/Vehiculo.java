
package autonoma.Vehiculo.models;
import autonoma.Vehiculo.exceptions.AcelerarFrenarApagadoException;
import autonoma.Vehiculo.exceptions.FrenadoBruscoException;
import autonoma.Vehiculo.exceptions.FrenarSinMovimientoException;
import autonoma.Vehiculo.exceptions.FrenarVelocidadLimiteException;
import autonoma.Vehiculo.exceptions.MotorLimiteException;
import autonoma.Vehiculo.exceptions.EncendidoNuevamenteException;

/**
 * Esta es la clase Vehiculo
 *@since 20240331
 * @version 0.0.1
 * @author Abraham Velasquez 
 * @author aduin
 */
public class Vehiculo {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Atributos
    /**
     * 
     * marca: Nombre de la marca del vehiculo
     */
    private String marca;
    
    /**
     * 
     * añoFabricado: Año en la que el vehiculo fue fabricado
     */
    private String añoFabricado;
    
    /**
     * 
     * velocidadActual: Velocidad actual del vehiculo
     */
    private int velocidadActual;
    
    /**
     * 
     *Motor del vehiculo incorporado
     */
    private Motor motor;
    
    /*
     * Llantas del vehiculo incorporado
     */
    private Llanta llanta;
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Método Constructor
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
    /**
     * 
     * Recibe como parámetro la velocidad y se suma a la velocidad actual
     * @param velocidad 
     */
    public void acelerar(int velocidad){
              if(!motor.isEstado()){
             throw new AcelerarFrenarApagadoException ("No puedes acelerar un vehiculo apagado");
        }
              if(velocidadActual > motor.getVelocidadMax()){
                  throw new MotorLimiteException("No puedes acelerar por encima del limite, El vehiculo esta patinando ");
              }
             this.setVelocidadActual (this.getVelocidadActual() + velocidad);
       
    }
    
    /**
     * Recibe como parámetro la velocidad y reduce la velocidad actual a cero
     * @param velocidad 
     */
     public void frenar (int velocidad){
         if(velocidadActual == 0){
           throw new FrenarSinMovimientoException("No puedes frenar sin Movimiento");
         }
          if(!motor.isEstado()){
          throw new AcelerarFrenarApagadoException ("No puedes frenar un vehiculo apagado");
        }
          
       if(velocidadActual == motor.getVelocidadMax()){
           throw new FrenarVelocidadLimiteException("No puedes frenar a la velocidad limite, El Vehiculo esta patinando");
       }    
        this.setVelocidadActual (velocidad);
    }
     
    /**
     * Recibe como parámetro la velocidad y si la velocidad actual es mayor a 30km/h se considera un frenado brusco
     * @param velocidad 
     */
    public void frenarBruscamente(int velocidad){
        
        if (velocidadActual >llanta.getLimite() ){
                throw new FrenadoBruscoException ("El Vehiculo esta patinando");
            }
        
        if (velocidadActual > 30){
            this.setVelocidadActual(velocidad);
        }
    }
    
    public void apagar(){
        motor.apagar();
    }
    
    public void encender() throws EncendidoNuevamenteException{
        motor.encender();
    }
    
}
