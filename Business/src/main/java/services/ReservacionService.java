/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.ReservacionDAO;
import interfaces.IReservacionDAO;
import interfaces.IReservacionService;
import java.time.LocalDateTime;
import models.Cliente;
import models.Mesa;
import models.Reservacion;

/**
 *
 * @author martinez
 */
public class ReservacionService implements IReservacionService{
    private final IReservacionDAO reservacionDAO;
    
    public ReservacionService(){
        this.reservacionDAO = new ReservacionDAO();
    }
    
    @Override
    public void crearReservacion(Cliente cliente, Mesa mesa, LocalDateTime fechaHora, int numeroPersonas, double costoReservacion){
        Reservacion reservacion = new Reservacion(cliente, mesa, fechaHora, numeroPersonas, costoReservacion);
        reservacionDAO.crearReservacion(reservacion);
    }
}
