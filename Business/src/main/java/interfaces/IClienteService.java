/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Cliente;
import models.Reservacion;

/**
 *
 * @author martinez
 */
public interface IClienteService {
    void crearCliente(String nombre, String telefono, List<Reservacion> reservaciones);
    List<Cliente> getClientes();
}
