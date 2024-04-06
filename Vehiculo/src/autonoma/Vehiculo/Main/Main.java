/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autonoma.Vehiculo.Main;


import autonoma.Vehiculo.models.Vehiculo;
import autonoma.Vehiculo.views.VentanaPrincipal;

/**
 *
 * @author abrah
 */
public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo();
        VentanaPrincipal ventana = new VentanaPrincipal();
         ventana.setVisible(true);
         ventana.setAuto(auto);
        
    }
}
