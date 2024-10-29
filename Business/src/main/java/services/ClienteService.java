/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.ClienteDAO;
import interfaces.IClienteDAO;
import interfaces.IClienteService;
import java.util.List;
import models.Cliente;
import models.Reservacion;

/**
 *
 * @author martinez
 */
public class ClienteService implements IClienteService{
    private final IClienteDAO clienteDAO;
    
    public ClienteService(){
        this.clienteDAO = new ClienteDAO();
    }
    
    @Override
    public void crearCliente(String nombre, String telefono, List<Reservacion> reservaciones){
        Cliente cliente = new Cliente(nombre, telefono, reservaciones);
        clienteDAO.crearCliente(cliente);
    }
    
    public List<Cliente> getClientes(){
        return clienteDAO.getClientes();
    }
}
