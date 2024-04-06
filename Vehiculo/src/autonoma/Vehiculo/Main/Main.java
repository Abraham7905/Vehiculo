
package Autonoma.Vehiculo.Main;


import autonoma.Vehiculo.models.Llanta;
import autonoma.Vehiculo.models.Motor;
import autonoma.Vehiculo.models.Vehiculo;
import autonoma.Vehiculo.views.VentanaPrincipal;

/**
 *
 * @author abrah
 */
public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("1000 cc", 100, true);
        Llanta llanta1  = new Llanta("Buenas", 110);
        Vehiculo auto1 = new Vehiculo("God", "2024", 0, motor1, llanta1);
        VentanaPrincipal ventana = new VentanaPrincipal(auto1);
        ventana.setVisible(true);
    }
}
