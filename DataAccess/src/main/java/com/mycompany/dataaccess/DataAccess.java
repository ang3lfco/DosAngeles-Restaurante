/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dataaccess;

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
        System.out.println("Hello World!");
        Cliente c = new Cliente();
        Mesa m = new Mesa();
        Reservacion r = new Reservacion(c, m, LocalDateTime.now(), 4, 2000.00);
        ReservacionDAO rd = new ReservacionDAO();
        rd.crearReservacion(r);
    }
}
