/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.vehiculo.exceptions;

/**
 *
 * @author aduin
 */
public class EstadoEncendido extends RuntimeException {
    
    public EstadoEncendido (){
        super ("El vehiculo ya está encendido, no puedes encerderlo de nuevo");
    }
}
