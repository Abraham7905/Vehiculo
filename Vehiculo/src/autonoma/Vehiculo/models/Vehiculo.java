
package autonoma.Vehiculo.models;
import autonoma.Vehiculo.exceptions.AcelerarFrenarApagadoException;
import autonoma.Vehiculo.exceptions.FrenadoBruscoException;
import autonoma.Vehiculo.exceptions.FrenarSinMovimientoException;
import autonoma.Vehiculo.exceptions.FrenarVelocidadLimiteException;
import autonoma.Vehiculo.exceptions.MotorLimiteException;
import javax.swing.JOptionPane;

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
    /**
     * 
     * @param marca
     * @param añoFabricado
     * @param velocidadActual 
     * @param motor
     * @param llanta 
     */

    public Vehiculo(String marca, String añoFabricado, int velocidadActual, Motor motor, Llanta llanta){
        this.marca = marca;
        this.añoFabricado = añoFabricado;
        this.velocidadActual = velocidadActual;
        this.motor = motor;
        this.llanta = llanta;
    }

    /**
     *Constructor Vacio
     */
    public Vehiculo() {
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
                try {
                    if(motor.isEstado()){
                    } 
                } catch (AcelerarFrenarApagadoException e) {
                     JOptionPane.showMessageDialog(null, e.getMessage());
                }

                try {
                    if(velocidadActual <= motor.getVelocidadMax()){

                    }
                } catch (MotorLimiteException e ) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }


                    this.setVelocidadActual (this.getVelocidadActual() + velocidad);

            }
    
    /**
     * Recibe como parámetro la velocidad y reduce la velocidad actual a cero
     * @param velocidad 
     */
     public void frenar (int velocidad){
                /**
                 * Exception De Frenar Sin Movimiento
                 */
                try {
                    if(velocidadActual != 0){
                }
                } catch (FrenarSinMovimientoException e) {
                     JOptionPane.showMessageDialog(null, e.getMessage());
                }

                /**
                 * Exception De Acelerar/Frenar Apagado
                 */
               try {
                   if(motor.isEstado()){
                   } 
               } catch (AcelerarFrenarApagadoException e) {
                 JOptionPane.showMessageDialog(null, e.getMessage());
               }

            /**
             * Exception FrenarVelocidadException
             */
                    try {
                 if(velocidadActual != motor.getVelocidadMax()){

                 }
                } catch (FrenarVelocidadLimiteException e) {
                     JOptionPane.showMessageDialog(null, e.getMessage());
                     motor.apagar();
                }

               this.setVelocidadActual (velocidad);
    }
     
    /**
     * Recibe como parámetro la velocidad y si la velocidad actual es mayor a 30km/h se considera un frenado brusco
     * @param velocidad 
     */
    public void frenarBruscamente(int velocidad){
                /**
                 * Exception de Frenado Brusco
                 */
                try {
                    if (velocidadActual <=llanta.getLimite() ){
                    }
                     if (velocidadActual > 30){
                    this.setVelocidadActual(velocidad);
                }
                } catch (FrenadoBruscoException e) {
                     JOptionPane.showMessageDialog(null, e.getMessage());
                }

       
    }
    
    public void apagar(){
        motor.apagar();
    }
    
    public void encender() {
        motor.encender();
    }
    
}
