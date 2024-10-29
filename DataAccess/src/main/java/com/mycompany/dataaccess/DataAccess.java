/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dataaccess;

import dao.ClienteDAO;
import dao.ReservacionDAO;
import java.time.LocalDateTime;
import models.Cliente;
import models.Mesa;
import models.Reservacion;

/**
 *
 * @author martinez
 */
public class DataAccess {
    public static void main(String[] args) {
        Cliente c = new Cliente("Francisco Martinez", "6621946034", null);
        
//        Mesa m = new Mesa("tipo2","ubicacion2", 2,"codigo2");
//        Reservacion r = new Reservacion(c, m, LocalDateTime.now(), 2, 1000.00);
//        ReservacionDAO rd = new ReservacionDAO();
//        rd.crearReservacion(r);
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.crearCliente(c);
        System.out.println("Hello World!");
    }
}
