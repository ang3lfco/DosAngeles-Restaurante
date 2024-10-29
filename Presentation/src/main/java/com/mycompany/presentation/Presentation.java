/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.presentation;

import interfaces.IReservacionService;
import java.util.List;
import models.Reservacion;
import services.ReservacionService;

/**
 *
 * @author martinez
 */
public class Presentation {

    public static void main(String[] args) {
        IReservacionService rs = new ReservacionService();
        List<Reservacion> lr = rs.obtenerReservaciones();
        for(Reservacion r : lr){
            System.out.println(r.toString());
        }
        System.out.println("Hello World!");
    }
}
