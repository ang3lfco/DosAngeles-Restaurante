/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.Cliente;

/**
 *
 * @author martinez
 */
public interface IClienteDAO {
    void crearCliente(Cliente cliente);
    List<Cliente> getClientes();
}
